package com.techwish.rewards.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RewardsInterceptor implements HandlerInterceptor{
	
	private static String authorization = "Authorization";
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception {
	      
		String authToken = request.getHeader(authorization);
		if ("testRewards".equals(authToken)) {
			return true;
		} else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return false;
		}
	}
}
