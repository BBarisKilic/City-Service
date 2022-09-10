package com.bbkdevelopment.cityservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbkdevelopment.cityservice.model.City;
import com.bbkdevelopment.cityservice.repository.CityRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<City> getCities(String name) {
        if (name != null) {
            return cityRepository.findByName(name);

        }

        return cityRepository.findAll();
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public void updateCity(String id, City city) {
        City oldCity = getCityById(id);
        oldCity.setName(city.getName());
        oldCity.setCreationDate(new Date());

        cityRepository.save(oldCity);
    }

    public void deleteCity(String id) {
        cityRepository.deleteById(id);
    }

    public City getCityById(String id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("City not found!"));
    }
}
