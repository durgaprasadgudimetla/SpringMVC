package com.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmployeeMgmtController {
	@RequestMapping("/employee")
	public String helloWorld(Model m) {
		String message = "Hello World, Spring MVC @ Durga";
		m.addAttribute("message", message);
		return "employee"; 
	}
	
	@RequestMapping("/journal")
	public String menuWorld(Model m) {
		String message = "journal World, Spring MVC @ Durga";
		m.addAttribute("message", message);
		return "journal"; 
	}
}
