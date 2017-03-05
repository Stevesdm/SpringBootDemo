package com.steve.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steve.model.Person;

@RestController
public class TestController {

	   @RequestMapping("/")
	    public String hello(){
	    	return "hello world!!";
	    }
	    
	    @RequestMapping("/hello")
		public Person getPerson(){
			Person p =new Person();
			p.setName("stevesss");
			p.setAge(18);
			return p;
		}
	
}
