package com.test.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.AvailabilityDates;
import com.test.repo.AvailabilityRepository;

@Service
public class AvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    // Add availability dates for a doctor
    public AvailabilityDates addAvailability(AvailabilityDates availabilityDates) {
        return availabilityRepository.save(availabilityDates);
    }

    // Get availability dates by doctor ID
    public List<AvailabilityDates> getAvailabilityByDoctor(int doctorId) {
        return availabilityRepository.findByDoctor_DoctorId(doctorId);
    }

    // Get availability dates by date range
    public List<AvailabilityDates> getAvailabilityByDateRange(LocalDate startDate, LocalDate endDate) {
        return availabilityRepository.findByFromDateBetween(startDate, endDate);
    }
}
