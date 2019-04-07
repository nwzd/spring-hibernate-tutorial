package org.spring.ioc.annotations.impl;

import org.spring.ioc.annotations.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
