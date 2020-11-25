package com.country;

import org.springframework.data.jpa.repository.JpaRepository;

import com.country.model.Country;

public interface CountryRepo extends JpaRepository<Country,Integer>{
	

}
