package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

@Controller
public class empController {
	
	@GetMapping("/register2way")
	public String home(@ModelAttribute("emp")Employee emp) {
		return "employee";
	}

	@PostMapping("/register")
	public String employeeController(Model model,@ModelAttribute("emp")Employee emp) {
		System.out.print(emp);
		
		model.addAttribute("emp", emp);
		
		return "response";
	}
}
