package com.ubs.primenum.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ubs.springmvc.service.PrimeNumGeneratorService;

@Configuration
public class AppConfig {
	@Bean
	public PrimeNumGeneratorService getSampleService() {
		return new PrimeNumGeneratorService();
	}
}
