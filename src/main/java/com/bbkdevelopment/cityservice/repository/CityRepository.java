package com.bbkdevelopment.cityservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bbkdevelopment.cityservice.model.City;

public interface CityRepository extends MongoRepository<City, String> {
}
