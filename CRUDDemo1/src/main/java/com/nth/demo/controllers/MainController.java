package com.nth.demo.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nth.demo.model.Book;
import com.nth.demo.services.BookServices;

@Controller
public class MainController {
	
	
	
	@GetMapping("/hellojsp")
	public String Init() {
		return "index";
	}
	
	
}
