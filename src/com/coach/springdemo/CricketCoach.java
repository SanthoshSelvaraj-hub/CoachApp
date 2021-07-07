package com.coach.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress.");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam.");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	//create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor.");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - FortuneService.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
