package org.spring.ioc.annotations.impl;

import org.spring.ioc.annotations.Coach;
import org.spring.ioc.annotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.name}")
	private String name;

	@Autowired
	private FortuneService fortuneService;
	
	public String getDailyWorkout() {
		return name + "'s daily workout";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
