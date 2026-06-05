package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DigitalClockLoggerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DigitalClockLoggerApplication.class, args);
		
	}

	@Bean("ltime")
	LocalTime getTime() {
		return LocalTime.now();
	}

}
