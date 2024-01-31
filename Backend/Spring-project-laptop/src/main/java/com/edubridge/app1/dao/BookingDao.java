package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.BookingRecord;
import com.edubridge.app1.repo.BookingRepository;


@Repository
public class BookingDao {
	@Autowired
	private BookingRepository repo;
	
	public BookingRecord saveBookingRecord(BookingRecord b) {
		return repo.save(b);
	}
	
	public List<BookingRecord> getBookingRecords(){
		return repo.findAll();
	}
	
	public BookingRecord getBookingRecord(Integer bookingId) {
		return repo.findById(bookingId).get();
	}
	
	public void updateBookingRecord(BookingRecord b) {
		repo.save(b);
	}
	
	public void deleteBookingRecord(Integer bookingId) {
		repo.deleteById(bookingId);
	}
}
