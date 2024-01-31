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
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.BookingRecord;
import com.edubridge.app1.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
@RestController
public class BookingController {
	@Autowired
	private BookingService service;
	
	@PostMapping("/bookingRecord")
	public ResponseEntity<BookingRecord> save(@RequestBody BookingRecord bookingRecord){
		BookingRecord savedBookingRecord = service.saveBookingRecord(bookingRecord);
		return new ResponseEntity<>(savedBookingRecord, HttpStatus.OK);
	}

	@GetMapping("/bookingRecord")
	public ResponseEntity<List<BookingRecord>> getAllbookingRecords(){
	    List<BookingRecord> bookingRecords =service.getBookingRecords();
	    return new ResponseEntity<>(bookingRecords, HttpStatus.OK);
	}
	
	@GetMapping("/bookingRecord/{id}")
	public ResponseEntity<BookingRecord> getOneBookingRecord(@PathVariable("id") Integer bookingId){
		BookingRecord bookingRecord = service.getBookingRecord(bookingId);
		return new ResponseEntity<BookingRecord>(bookingRecord, HttpStatus.OK);
	}
	
		@DeleteMapping("/bookingRecord/{id}")
		public ResponseEntity<BookingRecord> deleteBookingRecord(@PathVariable("id") Integer bookingId){
		    service.deleteBookingRecord(bookingId);
			return new ResponseEntity<BookingRecord>(HttpStatus.OK);
	}
		
		  @PutMapping("/bookingRecord")
			public ResponseEntity<BookingRecord> updte(@RequestBody BookingRecord bookingRecord){
				service.saveBookingRecord(bookingRecord);
				return new ResponseEntity<>(HttpStatus.OK);
   }
}
