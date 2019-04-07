package org.spring.ioc.no.xml.impl;

import org.spring.ioc.no.xml.Coach;
import org.spring.ioc.no.xml.FortuneService;
import org.springframework.beans.factory.annotation.Value;


public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;

	public String getDailyWorkout() {
		return "swim coach's daily workout";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	

	
}
