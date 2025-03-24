package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Patient;
import com.test.repo.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Add a new patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get patient by ID
    public Patient getPatient(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    // Update patient details
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Delete a patient by ID
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }
}