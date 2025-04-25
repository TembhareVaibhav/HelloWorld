package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message","Hello from Index Page method.");
		return "index";
	}
}
