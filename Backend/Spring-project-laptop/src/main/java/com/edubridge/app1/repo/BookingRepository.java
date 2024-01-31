package com.edubridge.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.model.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Integer> {

	
}
