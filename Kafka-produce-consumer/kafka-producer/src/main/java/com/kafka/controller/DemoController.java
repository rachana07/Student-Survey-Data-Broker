package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kafka.bean.Student;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DemoController {
	
	@Autowired
	KafkaTemplate<String,Student> kafkaTemplate;
	
	private static final String TOPIC="my-topic";
	
	@PostMapping("/publish")
	public String publishMessage(@RequestBody Student student) {
		kafkaTemplate.send(TOPIC,student);
		return "Published successfully";
	}

}
