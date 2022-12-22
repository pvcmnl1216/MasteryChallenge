package com.niit.MasteryChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.niit.MasteryChallenge.service.MessageService;

@SpringBootApplication
public class MasteryChallengeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MasteryChallengeApplication.class);
		MessageService messageService = applicationContext.getBean(MessageService.class);
		System.out.println( messageService.getMessage());
	}

}
