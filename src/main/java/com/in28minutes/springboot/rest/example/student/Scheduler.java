package com.in28minutes.springboot.rest.example.student;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	
	@Scheduled(fixedRate = 1000)
	public void fixRateSch () {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate scheduler:: " + strDate);
	}
	
/*	@Scheduled(fixedDelay = 1000, initialDelay = 3000)
	   public void fixedDelaySch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Fixed Delay scheduler:: " + strDate);
	   }*/
}
