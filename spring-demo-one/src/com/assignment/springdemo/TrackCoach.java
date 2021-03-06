package com.assignment.springdemo;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
 
   public TrackCoach() {
	   
   }

   public TrackCoach(FortuneService fortuneService) {
	super();
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It:" + fortuneService.getFortune();
	}
//add an init method
	public void doMystartupStuff() {
		System.out.println("TrackCoach:inside method doMyStartupStuff");
	}
	
	//add an destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach:inside method doMyCleanupStuffYoYo");
	}
	
	
	
}
