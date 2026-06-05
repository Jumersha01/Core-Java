package com.nt;

import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class QuatGenrator {
	String arr[] = { "Life is short dont make it shorter..", "Never Give Up", "Stay Focued",
			"Consistancy over motivation" };
	Random ra = new Random();
	
//	@Scheduled(fixedDelay=1000)
//	public  void pring() {
//		System.out.println(ra.nextInt()/10000000);
//	}
	


	@Scheduled(cron = " 0 0 8 * * *")
	public void getMotivation() {
		int rNO = ra.nextInt()/10000000;
		if(rNO>=1&&rNO<=20) {
			
			System.out.println(arr[1]);
		}
		else if(rNO>=20&&rNO<=40) {
			System.out.println(arr[2]);
		}
		else {
			System.out.println(arr[3]);
		}
	}
}
