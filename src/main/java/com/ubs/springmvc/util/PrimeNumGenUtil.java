package com.ubs.springmvc.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author Vikas
 * Java 8 Utility to generate list of prime numbers
 */
public class PrimeNumGenUtil {
	public static List<Integer> primeNumbersUnTil(int n) {
        return IntStream
            .rangeClosed(2, n)
            .filter(x -> isPrime(x)).boxed()
            .collect(Collectors.toList());
    }
	
    private static boolean isPrime(int number) {
        return number > 1 && IntStream
            .range(2, number)
            .noneMatch(i -> number % i == 0);
    }
}
