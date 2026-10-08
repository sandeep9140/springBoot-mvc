package com.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@GetMapping("/employee")
	public String showForm() {
		System.out.println("called ");
		return "employee-entry";
	}
	
	@PostMapping("/employee")
	public String submitForm(
			@RequestParam String name,
			@RequestParam String avl,
			Model model
			) {
		
		 System.out.println("NAME = " + name);
		    System.out.println("AVL = " + avl);
		model.addAttribute("name", name);
		model.addAttribute("avl", avl);
		return "employee-data";
	}

}
