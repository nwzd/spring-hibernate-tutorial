package main;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.impl.TrackingCoach;

public class App {

	public static void main(String[] args) {
		Coach coach = new TrackingCoach();
		System.out.println(coach.getDailyWorkout());
	}

}
