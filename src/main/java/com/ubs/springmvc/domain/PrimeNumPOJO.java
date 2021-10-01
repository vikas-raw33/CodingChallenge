package com.ubs.springmvc.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Vikas
 * POJO of Prime Number 
 * Support for XML commented out
 */

/*@XmlRootElement(name = "primenum")*/
public class PrimeNumPOJO {
	private String initial;
    private List<Integer> primes;
    
    public PrimeNumPOJO() {
    	
    }
 
    public PrimeNumPOJO(String initial, List<Integer> primes) {
        this.initial = initial;
        this.primes = primes;
    }
    
    //@XmlElement
	public String getInitial() {
		return initial;
	}

    //@XmlElement
	public List<Integer> getPrimes() {
		return primes;
	}    
}
