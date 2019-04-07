package org.spring.ioc.annotations.impl;

import org.spring.ioc.annotations.Coach;
import org.spring.ioc.annotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class TennisCoach implements Coach {

	@Autowired // If there is only one implementation of FortuneService no need
				// to use Qualifier
	private FortuneService fortuneService;

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService2;

	// Constructor injection
	// @Autowired
	// public TennisCoach(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	public String getDailyWorkout() {
		return "Practice your backhand";
	}

	public String getDailyFortune() {
		return fortuneService2.getFortune();
	}
	// Setter injection
	// @Autowired
	// public void setFortuneService(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// }

}
