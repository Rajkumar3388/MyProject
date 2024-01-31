package com.edubridge.app1.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "LaptopCategories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

   // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "categories")
    //private Set<Laptop> laptops;

	/**
	 * 
	 */
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Categories(Integer categoryId, String categoryName, Set<Laptop> laptops) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		//this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/*public Set<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Set<Laptop> laptops) {
		this.laptops = laptops;
	}*/

    // Constructors, getters, and setters
    
}
