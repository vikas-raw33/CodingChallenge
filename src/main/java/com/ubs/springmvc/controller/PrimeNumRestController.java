package com.ubs.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubs.springmvc.domain.PrimeNumPOJO;
import com.ubs.springmvc.service.PrimeNumGeneratorService;

/**
 * 
 * @author Vikas
 * Rest handler for Prime Num
 */
@RestController
public class PrimeNumRestController {
	
	@Autowired
	private PrimeNumGeneratorService primeNumGenService;
	
	/*@RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }*/
 
    @RequestMapping(value="/primes/{number}", method=RequestMethod.GET)
    public PrimeNumPOJO primeNums(@PathVariable Integer number) {
        return primeNumGenService.calculateAllPrimes(number);
    }
	
}
