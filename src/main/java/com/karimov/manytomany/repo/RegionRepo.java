package com.karimov.manytomany.repo;

import com.karimov.manytomany.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepo extends JpaRepository<Region,Long> {
    Region findByRegionName(String regionName);
    Region deleteByRegionName(String regionName);
}
