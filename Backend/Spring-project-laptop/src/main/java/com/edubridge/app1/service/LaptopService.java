package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.app1.dao.LaptopDao;
import com.edubridge.app1.model.Categories;
import com.edubridge.app1.model.Laptop;

@Service
@Transactional
public class LaptopService {

    @Autowired
    private LaptopDao dao;

    public Laptop saveLaptop(Laptop laptop) {
        return dao.saveLaptop(laptop);
    }

    public List<Laptop> getLaptops() {
        return dao.getLaptops();
    }

    public Laptop getLaptop(Integer laptopId) {
        return dao.getLaptop(laptopId);
    }

    public void updateLaptop(Laptop laptop) {
        dao.updateLaptop(laptop);
    }

    public void deleteLaptop(Integer laptopId) {
        dao.deleteLaptop(laptopId);
    }
    public List<Laptop> getLaptopsByCategories(Categories categories){
		return dao.getLaptopsByCategories(categories);
	}
    public List<Laptop>getLaptops(String laptopName){
		return dao.getLaptops(laptopName);
	}
    
}

