package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Appointment;
import com.test.repo.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Schedule a new appointment
    public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Get appointment by ID
    public Appointment getAppointment(int id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    // Update appointment details
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Delete an appointment by ID
    public void cancelAppointment(int id) {
        appointmentRepository.deleteById(id);
    }
}