package com.ubs.primenum.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.ubs.springmvc.domain.PrimeNumPOJO;
import com.ubs.springmvc.service.PrimeNumGeneratorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class PrimeNumJUnits {
	
	@Autowired
	private PrimeNumGeneratorService primeNumGenService;
	
	@Test
	public void testPrimeNumbers() {
		int number = 8;
		List<Integer> expecteds = new ArrayList<>();
		expecteds.add(2);
		expecteds.add(3);
		expecteds.add(5);
		expecteds.add(7);
		PrimeNumPOJO primeNum = primeNumGenService.calculateAllPrimes(number);
		System.out.println(primeNum.getPrimes());
		assertArrayEquals(expecteds.toArray(), primeNum.getPrimes().toArray());
	}
}
