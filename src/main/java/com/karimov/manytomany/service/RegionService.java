package com.karimov.manytomany.service;

import com.karimov.manytomany.entity.Country;
import com.karimov.manytomany.entity.Region;
import com.karimov.manytomany.repo.RegionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    private final RegionRepo regionRepo;

    public RegionService(RegionRepo regionRepo) {
        this.regionRepo = regionRepo;
    }


    public List<Region> getAll() {
        return regionRepo.findAll();
    }

    public Region getOne(String regionName) {
        return regionRepo.findByRegionName(regionName);
    }


    public void addRegion(Region region) {
        regionRepo.save(region);
    }

    public void deleteRegion(String regionName) {
        regionRepo.deleteByRegionName(regionName);
    }
}
