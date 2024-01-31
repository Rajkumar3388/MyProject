package com.edubridge.app1.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Categories;
import com.edubridge.app1.model.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
   List<Laptop> findBycategories(Categories categories);
   List<Laptop>findByLaptopNameContaining(String laptopName);
}

