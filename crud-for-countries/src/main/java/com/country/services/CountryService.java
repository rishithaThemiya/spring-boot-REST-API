package com.country.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.model.Country;
import com.country.CountryRepo;

@Service
public class CountryService {

	@Autowired
	private CountryRepo repo;
	
	public List<Country> fetchCountryList() {
		return repo.findAll();
	}
	
	public Country saveCountryToDB(Country country) {
		return repo.save(country);
	}
	
	public Optional<Country> fetchCountryById(int id) {
		return repo.findById(id);
	}
	
	public String deleteCountryById(int id) {
		
		String result = "";
		try {
			repo.deleteById(id);
			result = "successfully deleted";
		} catch (Exception e) {
			result = "Country with id is not deleted";
		} 
		return result;
	}
	
	public Country saveEditedCountryToDB(Country country) {
		return repo.saveAndFlush(country);
	}

}
