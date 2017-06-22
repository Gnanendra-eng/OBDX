package com.jmr.obdx.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jmr.obdx.service.FundtransferService;

@Component
public class McxAdapter {
	
	private static Logger logger = Logger.getLogger(McxAdapter.class);

	
	public String getAdapterResponse(StringWriter requestObject,String requestUrl,String requestMethod) throws Exception {
		  HttpURLConnection conn = null;
		  BufferedReader bufferedReader=null;
		   URL url= new URL(requestUrl);
		   conn = (HttpURLConnection) url.openConnection();
		   //conn.setReadTimeout(10000);
		  // conn.setConnectTimeout(15000);
		   conn.setRequestMethod(requestMethod);
		   conn.setRequestProperty("content-type", "text/xml; charset=utf-8");
		   conn.setDoInput(true);
		   conn.setDoOutput(true);
		   OutputStream output = new BufferedOutputStream(conn.getOutputStream());
		   output.write(requestObject.toString().getBytes());
		   output.flush();
		   if(HttpURLConnection.HTTP_OK==conn.getResponseCode()){
				bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}
		   if(HttpURLConnection.HTTP_SERVER_ERROR==conn.getResponseCode()){
				bufferedReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
		   String decodedString;
		   StringBuffer response = new StringBuffer();
		   while ((decodedString = bufferedReader.readLine()) != null) {
			  response.append(decodedString);
		   }
		   bufferedReader.close();
		   conn.disconnect();
		   return response.toString();
		
		}
}


