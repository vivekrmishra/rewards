package com.techwish.rewards.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RewardsInterceptorAppConfig implements WebMvcConfigurer{
	
	@Autowired
	RewardsInterceptor rewardsInterceptor;
	
	@Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(rewardsInterceptor);
	   }
}
