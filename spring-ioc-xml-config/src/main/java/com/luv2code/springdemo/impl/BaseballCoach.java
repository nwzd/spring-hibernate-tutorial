package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "BaseballCoach's daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
