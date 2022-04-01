package com.karimov.manytomany.controller;

import com.karimov.manytomany.entity.District;
import com.karimov.manytomany.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("district")
public class DistrictController {
    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping("/get-all")
    public List<District> getAll(){
        return districtService.getAll();
    }

    @GetMapping("get-one/{districtName}")
    public District getOne(@PathVariable("districtName") String districtName){
        return districtService.getOne(districtName);
    }

    @PostMapping("/add-country")
    public void addCountry(@RequestBody District district){
        districtService.addDistrict(district);
    }

    @DeleteMapping("/delete-country/{districtName}")
    public void deleteCountry(@PathVariable("districtName") String districtName){
        districtService.deleteDistrict(districtName);
    }
}
