package com.coach.springdemo;

public class HockeyCoach implements Coach{
	
	private FortuneService fortuneService;
	

	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play a practice match everyday.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
