package com.steve.SpringBoot_helloworld;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steve.configuration.ConfigProperties;
import com.steve.model.Person;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan("com.steve")
@EnableScheduling
@EnableConfigurationProperties(ConfigProperties.class)
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Value("${steve.jobson.name}")
    private String name;
    
    @Resource
    private ConfigProperties properties;
    
    @Scheduled(cron= "0/5 * * * * ?")
    public void scheduler(){
    	System.out.println("hello" + name + "---" + properties.getName());
    }
 
}
