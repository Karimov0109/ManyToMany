package com.karimov.manytomany.repo;

import com.karimov.manytomany.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {
    Country findByCountryName(String countryName);
    void deleteByCountryName(String countryName);
}
