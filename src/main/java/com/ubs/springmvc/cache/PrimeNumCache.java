package com.ubs.springmvc.cache;

import java.util.HashMap;
import java.util.Map;

import com.ubs.springmvc.domain.PrimeNumPOJO;

/**
 * 
 * @author Vikas
 * Singleton class to be used as cache. checks if number is already present or not.
 *
 */
public class PrimeNumCache {
	private Map<Integer, PrimeNumPOJO> map = new HashMap<>();

    private static PrimeNumCache instance = null;

    private PrimeNumCache() {}

    public static PrimeNumCache getInstance() {
        if (instance == null)
            instance = new PrimeNumCache();
        return instance;
    }

    public void put(Integer until, PrimeNumPOJO pojo) {
        map.put(until,pojo);
    }
    
    public PrimeNumPOJO get(Integer until) {
    	return map.get(until);
    }
}
