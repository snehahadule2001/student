package com.sneha.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")


public class DemoController {
	@GetMapping("hadule")
	public String firstapi() {
		return "working";
	}
	

}
