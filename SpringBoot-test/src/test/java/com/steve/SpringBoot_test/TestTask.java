package com.steve.SpringBoot_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.steve.task.TaskOne;
import com.steve.task.TaskTwo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class TestTask {

	@Autowired
	TaskOne task01;
	
	@Autowired
	TaskTwo task02;

	@Test
	public void testTask() throws InterruptedException{
		task01.Task1();
		task01.Task2();
		task01.Task3();
	}
	
	@Test
	public void testAsync() throws InterruptedException{
		task02.Task1();
		task02.Task2();
		task02.Task3();
	}
	
	
}
