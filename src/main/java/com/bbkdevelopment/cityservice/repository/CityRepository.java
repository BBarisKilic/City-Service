package com.bbkdevelopment.cityservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bbkdevelopment.cityservice.model.City;

public interface CityRepository extends MongoRepository<City, String> {
    List<City> findByName(String name);
}
