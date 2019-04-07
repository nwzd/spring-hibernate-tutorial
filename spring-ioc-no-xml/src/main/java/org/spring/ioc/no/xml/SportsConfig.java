package org.spring.ioc.no.xml;

import org.spring.ioc.no.xml.impl.SadFortuneService;
import org.spring.ioc.no.xml.impl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService sadOne(){
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach(){
		SwimCoach coach = new SwimCoach();
		coach.setFortuneService(sadOne());
		return coach;
	}
}
