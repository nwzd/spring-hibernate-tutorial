package org.spring.ioc.no.xml;

import org.spring.ioc.no.xml.impl.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println("email: " + swimCoach.getEmail());
		System.out.println("name: " + swimCoach.getName());
	}
}
