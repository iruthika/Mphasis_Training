package com.test.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.entity.AvailabilityDates;
import com.test.service.AvailabilityService;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

    @Autowired
    private AvailabilityService availabilityService;

    // Add availability dates for a doctor
    @PostMapping
    public ResponseEntity<AvailabilityDates> addAvailability(@RequestBody AvailabilityDates availabilityDates) {
        AvailabilityDates savedAvailability = availabilityService.addAvailability(availabilityDates);
        return ResponseEntity.ok(savedAvailability);
    }

    // Get availability by doctor ID
    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<AvailabilityDates>> getAvailabilityByDoctor(@PathVariable int doctorId) {
        return ResponseEntity.ok(availabilityService.getAvailabilityByDoctor(doctorId));
    }

    // Get availability by date range
    @GetMapping("/dates")
    public ResponseEntity<List<AvailabilityDates>> getAvailabilityByDateRange(@RequestParam String startDate, @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return ResponseEntity.ok(availabilityService.getAvailabilityByDateRange(start, end));
    }
}
