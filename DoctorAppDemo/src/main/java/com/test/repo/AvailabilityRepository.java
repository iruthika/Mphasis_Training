package com.test.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.test.entity.AvailabilityDates;

@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityDates, Integer> {

	List<AvailabilityDates> findByDoctor_DoctorId(int doctorId);

	List<AvailabilityDates> findByFromDateBetween(LocalDate startDate, LocalDate endDate);
}
