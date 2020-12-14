package com.example.App2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("m2")
public class App2Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String greetings() {
		LOG.info("::::: greetings in m2 ::::::::");
		String response = null;
		response = restTemplate.getForObject("http://localhost:8083/m3", String.class);
		LOG.info(":::::::Response is: "+response+":::::::::::");
		return response;
	}
}
