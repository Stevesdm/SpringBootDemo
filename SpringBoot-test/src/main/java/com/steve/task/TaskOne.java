package com.steve.task;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TaskOne {
	
	private Random random = new Random();
	
	public void Task1() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task1");
		Thread.sleep(random.nextInt(200));
		Long end = System.currentTimeMillis();
		System.out.println("task1 执行完毕,耗时"+(end-start)+"毫秒");
	}
	
	public void Task2() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task2");
		Thread.sleep(random.nextInt(200));
		Long end = System.currentTimeMillis();
		System.out.println("task2 执行完毕,耗时"+(end-start)+"毫秒");
	}
	
	public void Task3() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task2");
		Thread.sleep(random.nextInt(200));
		Long end = System.currentTimeMillis();
		System.out.println("task3 执行完毕,耗时"+(end-start)+"毫秒");
	}
}
