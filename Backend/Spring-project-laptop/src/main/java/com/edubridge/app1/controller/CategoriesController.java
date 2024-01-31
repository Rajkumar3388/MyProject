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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.Categories;
import com.edubridge.app1.service.CategoriesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class CategoriesController {
@Autowired
private CategoriesService service;

@PostMapping("/categories")
public ResponseEntity<Categories> save(@RequestBody Categories categories){
	Categories savedCategories=service.saveCategories(categories);
	return new ResponseEntity<>(savedCategories,HttpStatus.OK);
}
@GetMapping("/categories")
public ResponseEntity<List<Categories>> getCategories(){
	List<Categories> categories= service.getCategories();
	return new ResponseEntity<>(categories,HttpStatus.OK);
}

@GetMapping("/categories/{id}")
public ResponseEntity<Categories>getCategories(@PathVariable("id") Integer categoriesId){
	Categories categories= service.getCategories(categoriesId);
	return new ResponseEntity<Categories>(categories,HttpStatus.OK);
}

@DeleteMapping("/categories/{id}")
public ResponseEntity<Categories>deleteCategories(@PathVariable("id") Integer categoriesId){
	 service.deleteCategory(categoriesId);
	return new ResponseEntity<Categories>(HttpStatus.OK);
}

@PutMapping("/categories")
public ResponseEntity<Categories> update(@RequestBody Categories categories){
    Categories updatedCategories = service.saveCategories(categories);
    return new ResponseEntity<>(updatedCategories, HttpStatus.OK);
}

}
