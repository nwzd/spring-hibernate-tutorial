package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService tennisCoachFortune;
	
	private String emailAddress;
	
	private String name;
	
	public TennisCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach's workout";
	}

	@Override
	public String getDailyFortune() {
		return tennisCoachFortune.getFortune();
	}

	public void setTennisCoachFortune(FortuneService fortuneService) {
		this.tennisCoachFortune = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return name;
	}
	
	

}
