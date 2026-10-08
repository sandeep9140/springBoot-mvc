package com.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	int a=0;
	@GetMapping("/student")
	public String student() {
		
		System.out.println("hello run this : "+(++a));
		
		return "student";
	}

}
