package com.ponnalearn.k8stest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return " Hello .. All The best for your Kubernetes learning Using GIT";
	}
	

}
