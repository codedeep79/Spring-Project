package com.nth.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String ShowForm(HttpServletRequest request) {
		request.setAttribute("name", "Nguyễn Trung Hậu");
		return "hello";
	}
}
