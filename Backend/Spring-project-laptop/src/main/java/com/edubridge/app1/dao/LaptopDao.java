package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Categories;
import com.edubridge.app1.model.Laptop;
import com.edubridge.app1.repo.LaptopRepository;

@Repository
public class LaptopDao {

	@Autowired
	private LaptopRepository repo;
	public Laptop saveLaptop(Laptop l) {
		return repo.save(l);
		
	}
	public List<Laptop>getLaptops(){
		return repo.findAll();
	}
	public Laptop getLaptop(Integer laptopId) {
		return repo.findById(laptopId).get();
		
	}
	public void updateLaptop(Laptop l) {
		repo.save(l);
	}
	public void deleteLaptop(Integer laptopId) {
		repo.deleteById(laptopId);
	}
	public List<Laptop> getLaptopsByCategories(Categories categories){
		return repo.findBycategories(categories);
	}
	public List<Laptop>getLaptops(String laptopName){
		return repo.findByLaptopNameContaining(laptopName);
	}
	
}
