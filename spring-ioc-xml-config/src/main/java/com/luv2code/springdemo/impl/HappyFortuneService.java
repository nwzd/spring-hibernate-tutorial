package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
