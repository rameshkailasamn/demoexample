package com.dockerexample.demoexample.dockerresouce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@Value("${uname:Dr Ramesh Kailasam}")
	public String name;

	@RequestMapping(value="/greet")
	public String greeting() {
		return "<H1>Good Morning</h1><B> "+name;
	}
}
