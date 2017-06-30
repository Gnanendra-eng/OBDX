package com.mcx.adapter;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;


@Component
public class McxAdapter {

 public String getResponse() {
  HttpURLConnection conn = null;
  try {
   URL url = new URL("httpurl");
   conn = (HttpURLConnection) url.openConnection();
   conn.setReadTimeout(10000);
   conn.setConnectTimeout(15000);
   conn.setRequestMethod("POST");
   conn.setDoInput(true);
   conn.setDoOutput(true);
   String body = "request";
   OutputStream output = new BufferedOutputStream(conn.getOutputStream());
   output.write(body.getBytes());
   BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String decodedString;
   while ((decodedString = in.readLine()) != null) {
   System.out.println(decodedString);
   }
   output.flush();
   in.close();
   } catch (Exception e) {
    e.printStackTrace();
   } finally {
    conn.disconnect();
   }
  return "Success";

    }
}