package com.test.entity;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Doctor implements Serializable {
	@Id
    private int doctorId;
    private String doctorName;
    private String speciality;
    private String location;
    private String hospitalName;
    private String mobileNo;
    private String email;
    private String password;
    private double chargedPerVisit;

    // Getters and Setters

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getChargedPerVisit() {
        return chargedPerVisit;
    }

    public void setChargedPerVisit(double chargedPerVisit) {
        this.chargedPerVisit = chargedPerVisit;
    }
}
