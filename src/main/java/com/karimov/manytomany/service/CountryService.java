package com.karimov.manytomany.service;

import com.karimov.manytomany.entity.Country;
import com.karimov.manytomany.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepo countryRepo;

    @Autowired
    public CountryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    public List<Country> getAll() {
        return countryRepo.findAll();
    }

    public Country getOne(String countryName) {
       return countryRepo.findByCountryName(countryName);
    }


    public void addCountry(Country country) {
        countryRepo.save(country);
    }

    public void deleteCountry(String countryName) {
        countryRepo.deleteByCountryName(countryName);
    }
}
