package com.edubridge.app1.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="booking_Records")
public class BookingRecord {
	@Id
	@GeneratedValue
	private Integer bookingId;
	private Date bookingDate;
	private Date returnDate;
	private double bookingFee;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "laptopId")
	private Laptop laptop;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId")
	private CustomerRegistration customer;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId")
	private Categories categories;

	public BookingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getBookingFee() {
		return bookingFee;
	}

	public void setBookingFee(double bookingFee) {
		this.bookingFee = bookingFee;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public CustomerRegistration getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerRegistration customer) {
		this.customer = customer;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "BookingRecord [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", returnDate=" + returnDate
				+ ", bookingFee=" + bookingFee + ", laptop=" + laptop + ", customer=" + customer + ", categories="
				+ categories + "]";
	}

	/**
	 * @param bookingId
	 * @param bookingDate
	 * @param returnDate
	 * @param bookingFee
	 * @param laptop
	 * @param customer
	 * @param categories
	 */
	public BookingRecord(Integer bookingId, Date bookingDate, Date returnDate, double bookingFee, Laptop laptop,
			CustomerRegistration customer, Categories categories) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.returnDate = returnDate;
		this.bookingFee = bookingFee;
		this.laptop = laptop;
		this.customer = customer;
		this.categories = categories;
	}

	
    
	
}
