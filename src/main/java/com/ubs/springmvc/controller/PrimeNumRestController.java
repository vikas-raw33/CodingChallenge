package com.ubs.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
 
    @RequestMapping(value="/primes/{number}", produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
    public ResponseEntity<PrimeNumPOJO> primeNums(@PathVariable Integer number) {
    	if(null == number || number < 0) {
    		return new ResponseEntity<PrimeNumPOJO>(HttpStatus.BAD_REQUEST);
    	} else {
	    	PrimeNumPOJO primeNum = primeNumGenService.calculateAllPrimes(number);
	        return new ResponseEntity<PrimeNumPOJO>(primeNum, HttpStatus.OK);
    	}
    }
	
}
