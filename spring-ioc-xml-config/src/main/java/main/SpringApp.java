package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.impl.TennisCoach;

public class SpringApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach tennisCoach = applicationContext.getBean("tennisCoach", Coach.class);
		Coach trackingCoach = applicationContext.getBean("trackingCoach", Coach.class);

		
		// call the methods on the bean
		System.out.println(trackingCoach.getDailyWorkout());
		
		System.out.println(trackingCoach.getDailyFortune());
		
		System.out.println(trackingCoach.getEmailAddress());
		
		System.out.println(trackingCoach.getName());
		
		// close the context
		applicationContext.close();
	}

}
