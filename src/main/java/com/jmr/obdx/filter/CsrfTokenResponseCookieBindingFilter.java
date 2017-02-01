package com.jmr.obdx.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;

/***
 * @author JMR
 */
public class CsrfTokenResponseCookieBindingFilter extends OncePerRequestFilter {
		
	   protected static final String REQUEST_ATTRIBUTE_NAME = "_csrf";
	   protected static final String RESPONSE_HEADER_NAME = "X-CSRF-HEADER";
	   protected static final String RESPONSE_PARAM_NAME = "X-CSRF-PARAM";
	   protected static final String RESPONSE_COOKIE_NAME = "CSRF-TOKEN"; 
	 
		@Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)throws ServletException, IOException {
			CsrfToken token = (CsrfToken) request.getAttribute(REQUEST_ATTRIBUTE_NAME);
			response.setHeader(RESPONSE_HEADER_NAME, token.getHeaderName());
			response.setHeader(RESPONSE_PARAM_NAME, token.getParameterName());
			Cookie cookie = new Cookie(RESPONSE_COOKIE_NAME, token.getToken());
			cookie.setPath("/");
			cookie.setHttpOnly(true);
			response.addCookie(cookie);
			filterChain.doFilter(request, response);
	  }
		
}
