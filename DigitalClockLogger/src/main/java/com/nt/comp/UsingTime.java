package com.nt.comp;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UsingTime {

@Autowired
private LocalTime time;	
	
@Scheduled(cron="0/5,0/10 * * * * *")
public void printTime() {
	System.out.println("Current Time: "+time.getHour()+": "+time.getMinute());
}
}
