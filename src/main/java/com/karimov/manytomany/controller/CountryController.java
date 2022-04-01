package com.karimov.manytomany.controller;

import com.karimov.manytomany.entity.Country;
import com.karimov.manytomany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "country")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/get-all")
    public List<Country> getAll(){
        return countryService.getAll();
    }

    @GetMapping("get-one/{countryName}")
    public Country getOne(@PathVariable("countryName") String countryName){
        return countryService.getOne(countryName);
    }

    @PostMapping("/add-country")
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }

    @DeleteMapping("/delete-country/{countryName}")
    public void deleteCountry(@PathVariable("countryName") String countryName){
        countryService.deleteCountry(countryName);
    }
}
