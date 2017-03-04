package com.steve.SpringBoot_mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=App.class)
public class TestSendMail {

	@Autowired
	JavaMailSender javaMailSender;
	
	@Test
	public void sendEmail(){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("845109060@qq.com");
		message.setTo("3206805957@qq.com");
		message.setSubject("Subject");
		message.setText("this is test email");
		
		javaMailSender.send(message);
	}
}
