package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Doctor;
import com.test.repo.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Add a new doctor
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Get doctor by ID
    public Doctor getDoctor(int id) {
        return doctorRepository.findById(id).orElse(null);
    }

    // Update doctor details
    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Delete a doctor by ID
    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }

    // Get a list of doctors based on specialty
    public List<Doctor> findDoctorsBySpeciality(String speciality) {
        return doctorRepository.findBySpeciality(speciality);
    }
}
