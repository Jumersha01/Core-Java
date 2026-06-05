package com.nt;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
    
	@Scheduled(cron="0 0 10 * * *")
	public void getTask() {
		System.out.println("Meeting is started");
	}
	
	

	@Scheduled(cron="0 30 9 * * *")
	public void getRemider() {
		System.out.println("Meeting is on 10 : AM");
	}
	
}
