package com.steve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steve.task.TaskOne;
import com.steve.task.TaskTwo;

@RestController
public class TestController {

	@Autowired
	private TaskOne one;
	
	@Autowired
	private TaskTwo two;
	
	@RequestMapping("task1")
	public String task1() throws InterruptedException{
		one.Task1();
		one.Task2();
		one.Task3();
		return "finish tash1";
	}
	
	@RequestMapping("task2")
	public String task2() throws InterruptedException{
		two.Task1();
		two.Task2();
		two.Task3();
		return "finish tash2";
	}
}
