package com.karimov.manytomany.service;

import com.karimov.manytomany.entity.Country;
import com.karimov.manytomany.entity.District;
import com.karimov.manytomany.entity.Region;
import com.karimov.manytomany.repo.DistrictRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    private final DistrictRepo districtRepo;

    public DistrictService(DistrictRepo districtRepo) {
        this.districtRepo = districtRepo;
    }

    public List<District> getAll() {
        return districtRepo.findAll();
    }

    public District getOne(String districtName) {
        return districtRepo.findByDistrictName(districtName);
    }


    public void addDistrict(District district) {
        districtRepo.save(district);
    }

    public void deleteDistrict(String districtName) {
        districtRepo.deleteByDistrictName(districtName);
    }
}
