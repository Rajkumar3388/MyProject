package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.Categories;
import com.edubridge.app1.model.Laptop;
import com.edubridge.app1.service.CategoriesService;
import com.edubridge.app1.service.LaptopService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class LaptopController {
@Autowired
private LaptopService service;
@Autowired
private CategoriesService categoriesservice;
  

@PostMapping("/laptop")
public ResponseEntity<Laptop> save(@RequestBody Laptop laptop){
	Laptop savedLaptop= service.saveLaptop(laptop);
	return new ResponseEntity<>(savedLaptop,HttpStatus.OK);
}


@GetMapping("/laptop")
public ResponseEntity<List<Laptop>> getLaptops(){
	List<Laptop> laptops= service.getLaptops();
	return new ResponseEntity<>(laptops,HttpStatus.OK);
}

@GetMapping("/laptop/{id}")
public ResponseEntity<Laptop>getLaptop(@PathVariable("id") Integer laptopId){
	Laptop laptop= service.getLaptop(laptopId);
	return new ResponseEntity<Laptop>(laptop,HttpStatus.OK);
}

@DeleteMapping("/laptop/{id}")
public ResponseEntity<Laptop>deleteLaptop(@PathVariable("id") Integer laptopId){
	 service.deleteLaptop(laptopId);
	return new ResponseEntity<Laptop>(HttpStatus.OK);
}

@PutMapping("/laptop")
public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
    Laptop updatedLaptop = service.saveLaptop(laptop);
    return new ResponseEntity<>(updatedLaptop, HttpStatus.OK);
}

@GetMapping("/laptop/laptopsByCategories/{categoryId}")
public ResponseEntity<List<Laptop>>getLaptopsByCategories(@PathVariable Integer categoryId){
	Categories categories=categoriesservice.getCategories(categoryId);
	List<Laptop> laptops=service.getLaptopsByCategories(categories);
	return new ResponseEntity<>(laptops,HttpStatus.OK);
}
@GetMapping("/laptop/search/{laptopName}")
public ResponseEntity<List<Laptop>>getlaptopNameContaininglaptop(@PathVariable String laptopName ){
//	Laptop laptop=service.getLaptops(laptopName);
	List<Laptop> laptops=service.getLaptops(laptopName);
	return new ResponseEntity<>(laptops,HttpStatus.OK);
	}
}


 