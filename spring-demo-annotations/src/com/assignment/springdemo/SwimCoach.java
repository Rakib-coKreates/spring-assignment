package com.assignment.springdemo;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
