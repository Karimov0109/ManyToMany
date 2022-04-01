package com.karimov.manytomany.repo;

import com.karimov.manytomany.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District,Long> {
    District findByDistrictName(String districtName);
    District deleteByDistrictName(String districtName);
}
