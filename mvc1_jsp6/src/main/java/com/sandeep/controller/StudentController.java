package com.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	@GetMapping("/student")
	public String showForm() {
		return "student-form";
	}
	
	@PostMapping("/student")
	public String submitForm(
			@RequestParam String name,
			@RequestParam int age,
			Model model
			) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "student";
	}

}
