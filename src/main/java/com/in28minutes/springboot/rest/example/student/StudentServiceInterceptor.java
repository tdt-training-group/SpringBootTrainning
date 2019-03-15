package com.in28minutes.springboot.rest.example.student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class StudentServiceInterceptor implements HandlerInterceptor {
	private int numRunOver;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Pre handle method is call!" );
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle,
			ModelAndView modelAndView) throws Exception {

		System.out.println("Post handle method is calling");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
		numRunOver += 1;
		System.out.println("Request and Response is completed: "+ numRunOver + " Times");
	}
}
