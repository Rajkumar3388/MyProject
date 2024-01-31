package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.BookingDao;
import com.edubridge.app1.model.BookingRecord;
@Service
public class BookingService {
	@Autowired
	private BookingDao dao;
	

	public BookingRecord saveBookingRecord(BookingRecord b) {
		return dao.saveBookingRecord(b);
	}
	
	public List<BookingRecord> getBookingRecords(){
		return dao.getBookingRecords();
	}
	
	public BookingRecord getBookingRecord(Integer bookingId) {
		return dao.getBookingRecord(bookingId);
	}
	
	public void updateBookingRecord(BookingRecord b) {
		dao.updateBookingRecord(b);
	}
	
	public void deleteBookingRecord(Integer bookingId) {
		dao.deleteBookingRecord(bookingId);
	}
}
