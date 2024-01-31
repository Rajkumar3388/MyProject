package com.edubridge.app1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "Laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Integer laptopId;

    @Column(name = "laptop_name")
    private String laptopName;

    @Column(name = "laptop_model")
    private String laptopModel;

    @Column(name = "laptop_color")
    private String laptopColor;

    @Column(name = "laptop_price")
    private Double laptopPrice;

    @Column(name = "laptop_version")
    private String laptopVersion;

    @Column(name = "image_url")
    private String imageUrl;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") // This should match the name of the column in the database
    private Categories categories;

	/**
	 * 
	 */
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Laptop(Integer laptopId, String laptopName, String laptopModel, String laptopColor, Double laptopPrice,
			String laptopVersion, String imageUrl, Categories categories) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopModel = laptopModel;
		this.laptopColor = laptopColor;
		this.laptopPrice = laptopPrice;
		this.laptopVersion = laptopVersion;
		this.imageUrl = imageUrl;
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopModel=" + laptopModel
				+ ", laptopColor=" + laptopColor + ", laptopPrice=" + laptopPrice + ", laptopVersion=" + laptopVersion
				+ ", imageUrl=" + imageUrl + ", categories=" + categories + "]";
	}

	public Integer getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getLaptopColor() {
		return laptopColor;
	}

	public void setLaptopColor(String laptopColor) {
		this.laptopColor = laptopColor;
	}

	public Double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(Double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public String getLaptopVersion() {
		return laptopVersion;
	}

	public void setLaptopVersion(String laptopVersion) {
		this.laptopVersion = laptopVersion;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

    // Constructors, getters, and setters
    
}
