package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.app1.dao.CategoriesDao;
import com.edubridge.app1.model.Categories;




@Service
@Transactional
public class CategoriesService {
 @Autowired
 private CategoriesDao dao;
 public Categories saveCategories(Categories category) {
     return dao.saveCategories(category);
 }

 public List<Categories> getCategories() {
     return dao.getCategories();
 }

 public Categories getCategories(Integer categoriesId) {
     return dao.getCategories(categoriesId);
 }

 public void updateCategories(Categories category) {
   dao.updateCategories(category);
 }

 public void deleteCategory(Integer categoryId) {
     dao.deleteCategory(categoryId);
 }
}
