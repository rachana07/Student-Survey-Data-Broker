package com.kafka.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.exception.ResourceNotFoundException;
import com.kafka.bean.Student;

import org.json.*;


@Component
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class KafkaConsumer {
	
	public List<Student> data=new ArrayList<Student>();
	
	public JSONObject msg;
	long id;
    String firstName;
	
	
	String lastName;
	
	
	String emailId;
	
	
	String address;
	
	
	String city;
	
	
	private String state;
	
	
	private long zipcode;
	
	
	private String telephone;
	
	
	private String date;
	
	
	private String likeMOst;
	
	
	private String interest;
	
	
	private String recommend;
	
	@KafkaListener(topics="my-topic",groupId="group_id")
	public void consume(String message) {
		System.out.println("message= "+message);
		JSONObject test = new JSONObject(message);
//		isbn=test.getString("isbn");
//		bookName=test.getString("bookName");
////		data.add(message);
//		Book sampleBook=new Book(bookName,isbn);
		id=test.getLong("id");
		firstName=test.getString("firstName");
		lastName=test.getString("lastName");
		emailId=test.getString("emailId");
		address=test.getString("address");
		city=test.getString("city");
		state=test.getString("state");
		zipcode=test.getLong("zipcode");	
		telephone=test.getString("telephone");
		date=test.getString("date");
		likeMOst=test.getString("likeMOst");
		interest=test.getString("interest");
		recommend=test.getString("recommend");
		Student student=new Student(id,firstName,lastName,emailId,address,city,state,zipcode,telephone,date,likeMOst,interest,recommend);
		data.add(student);
////		send(message);
	}
	
	@GetMapping("/students")
	public List<Student> send() {
		
		return data;
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id){
		for(Student student:data) {
			if(student.getId()==id) {
				return ResponseEntity.ok(student);
			}
		}
		return ResponseEntity.ok(null);
	}
	
	
}
