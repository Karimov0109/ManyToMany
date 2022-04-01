package com.karimov.manytomany.controller;

import com.karimov.manytomany.entity.Region;
import com.karimov.manytomany.service.RegionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("region")
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }
    @GetMapping("/get-all")
    public List<Region> getAll(){
        return regionService.getAll();
    }

    @GetMapping("get-one/{regionName}")
    public Region getOne(@PathVariable("regionName") String regionName){
        return regionService.getOne(regionName);
    }

    @PostMapping("/add-region")
    public void addCountry(@RequestBody Region region){
        regionService.addRegion(region);
    }

    @DeleteMapping("/delete-region/{regionName}")
    public void deleteCountry(@PathVariable("regionName") String regionName){
        regionService.deleteRegion(regionName);
    }
}
