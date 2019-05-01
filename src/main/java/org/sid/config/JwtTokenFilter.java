package org.sid.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {
	
	private static final Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);

	
	
	 private JwtTokenProvider jwtTokenProvider;

	  public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
	    this.jwtTokenProvider = jwtTokenProvider;
	  }

//	@Override
//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
//			throws IOException, ServletException {
//		String token = jwtTokenProvider.resolveToken((HttpServletRequest) req);
//	    try {
//	    	//if jeton trouvé ds l'entete deleguer l'auth a jwtTokenProvider
//	      if (token != null && jwtTokenProvider.validateToken(token)) {
//	        Authentication auth = token != null ? jwtTokenProvider.getAuthentication(token) : null;
//	        SecurityContextHolder.getContext().setAuthentication(auth);
//	      }
//	    }
//	    //exception
//	    catch (Exception e) {
//	    	logger.error("Can NOT set user authentication -> Message: {}", e);
////	      HttpServletResponse response = (HttpServletResponse) res;
////	      System.out.println("**************************** JWT Expiredd**************************");
////	      response.setContentType("application/json");
////	      response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
////	      response.getOutputStream().println("{ \"JWT ERROR \": \"" + " Expired or invalid JWT token" + "\" }");
////	      return;
//
//	    }
//
//	    chain.doFilter(req, res);
//	  }

	  
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String token = jwtTokenProvider.resolveToken((HttpServletRequest) request);
	    try {
	    	//if jeton trouvé ds l'entete deleguer l'auth a jwtTokenProvider
	      if (token != null && jwtTokenProvider.validateToken(token)) {
	        Authentication auth = token != null ? jwtTokenProvider.getAuthentication(token) : null;
	        SecurityContextHolder.getContext().setAuthentication(auth);
	      }
	    }
	    //exception
	    catch (Exception e) {
	    	logger.error("Can NOT set user authentication -> Message: {}", e);
		
	}
	    filterChain.doFilter(request, response);
	}
	
//	public String resolveToken(HttpServletRequest req) {
//		String bearerToken = req.getHeader("Authorization");
//		if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
//			return bearerToken.substring(7, bearerToken.length());
//		}
//		return null;
//	}
	
}
