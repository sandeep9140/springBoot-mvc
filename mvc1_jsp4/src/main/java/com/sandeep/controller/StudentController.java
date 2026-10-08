package com.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String student() {
		System.out.println("student called");
		return "student";
	}

}
