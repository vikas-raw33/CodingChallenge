package com.ubs.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ubs.springmvc.cache.PrimeNumCache;
import com.ubs.springmvc.domain.PrimeNumPOJO;
import com.ubs.springmvc.util.PrimeNumGenUtil;

/**
 * 
 * @author Vikas
 * Prime Number Generator Service with cache support 
 * 
 */

@Service
public class PrimeNumGeneratorService {
	public PrimeNumPOJO calculateAllPrimes(Integer number) {
		PrimeNumCache cache = PrimeNumCache.getInstance();
		if(null!=cache.get(number)) {
			System.out.println("Number Present in Cache : "+number);
			return cache.get(number);
		} else {
			List<Integer> primeNumbers = PrimeNumGenUtil.primeNumbersUnTil(number);
			PrimeNumPOJO primeNum = new PrimeNumPOJO(String.valueOf(number), primeNumbers);
			System.out.println("Putting Number in Cache: "+number);
			cache.put(number, primeNum);
			return primeNum;
		}
	}	
}
