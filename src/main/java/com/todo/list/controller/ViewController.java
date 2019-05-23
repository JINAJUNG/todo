package com.todo.list.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

	@GetMapping("/**")
	public String loca(HttpServletRequest request) {
		System.out.println(request.getRequestURI()+"uri");
		System.out.println(request.getRequestURL()+"url");
		System.out.println(request.getContextPath()+"path");
		return request.getRequestURI().substring(1);
	}
}
