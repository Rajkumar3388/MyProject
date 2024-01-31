package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Categories;
import com.edubridge.app1.repo.CategoriesRepository;

@Repository
public class CategoriesDao {

    @Autowired
    private CategoriesRepository repo;

    public Categories saveCategories(Categories category) {
        return repo.save(category);
    }

    public List<Categories> getCategories() {
        return repo.findAll();
    }

    public Categories getCategories(Integer categoriesId) {
        return repo.findById(categoriesId).get();
    }

    public void updateCategories(Categories category) {
        repo.save(category);
    }

    public void deleteCategory(Integer categoryId) {
        repo.deleteById(categoryId);
    }
}
