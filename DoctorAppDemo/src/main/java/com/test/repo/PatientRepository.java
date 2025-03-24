package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}