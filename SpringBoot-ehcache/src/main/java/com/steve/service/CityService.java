package com.steve.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.steve.model.CityInfo;

@Component
@CacheConfig(cacheNames="CityService")
public class CityService {

	@Cacheable
	public CityInfo getCity(int id, String city) {
		System.out.println("id:" + id + "city:" + city);
		return new CityInfo(id, city);
	}
}