package com.pkp.assignment.firstAssign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstAssignDemo {

	@RequestMapping("/first")
	@GetMapping
	public String returnValue() {
		return "Hello Everyone !";
	
	}
}
