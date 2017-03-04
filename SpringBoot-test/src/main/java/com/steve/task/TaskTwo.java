package com.steve.task;

import java.util.Random;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TaskTwo {
	private Random random = new Random();
	
	@Async
	public void Task1() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task1");
		Thread.sleep(random.nextInt(2000));
		Long end = System.currentTimeMillis();
		System.out.println("task1 执行完毕,耗时"+(end-start)+"毫秒");
	}
	
	@Async
	public void Task2() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task2");
		Thread.sleep(random.nextInt(2000));
		Long end = System.currentTimeMillis();
		System.out.println("task2 执行完毕,耗时"+(end-start)+"毫秒");
	}
	
	@Async
	public void Task3() throws InterruptedException{
		Long start =System.currentTimeMillis();
		System.out.println("开始执行task3");
		Thread.sleep(random.nextInt(2000));
		Long end = System.currentTimeMillis();
		System.out.println("task3 执行完毕,耗时"+(end-start)+"毫秒");
	}
}
