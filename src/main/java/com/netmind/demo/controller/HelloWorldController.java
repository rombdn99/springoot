package com.netmind.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	String home() {
		return "Hello World! Pepe";
	}
}
