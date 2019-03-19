package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class TrackingCoach implements Coach {
	private FortuneService fortune;

	private String emailAddress;

	private String name;

	@Override
	public String getDailyWorkout() {
		return "Tracking coach's daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String getName() {
		return name;
	}

	public FortuneService getFortune() {
		return fortune;
	}

	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void doinit(){
		System.out.println("Inside init method");
	}
	
	public void dodestroy(){
		System.out.println("Inside destroy method");
	}


}
