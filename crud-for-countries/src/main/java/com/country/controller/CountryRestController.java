package com.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.model.Country;
import com.country.services.CountryService;

@RestController 

@RequestMapping("country")
public class CountryRestController {
	
	@Autowired
	private CountryService service;
	
	@GetMapping("/getcountrylist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Country> fetchCountryList(){
		List<Country> Countries = new ArrayList<Country>();
		Countries = service.fetchCountryList();
		return Countries;
	} 
	
	@PostMapping("/addcountry")
	public Country saveProduct(@RequestBody Country country){
		   return service.saveCountryToDB(country);	
		}
	
	
	@GetMapping("/getcountrybyid/{id}")
	public Country fetchProductById(@PathVariable int id){
		return service.fetchCountryById(id).get();
	} 
	
	@PostMapping("/deletecountrybtid/{id}")
	public String deleteProductById(@RequestBody int id){
		   return service.deleteCountryById(id);
		}
	
	@PutMapping("/editcountry")
	public Country editProduct(@RequestBody Country country){
		   return service.saveEditedCountryToDB(country);	
		}
	

}
