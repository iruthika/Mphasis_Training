package com.test.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Feedback;
import com.test.repo.FeedbackRepository;
@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    // Add new feedback
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    // Get feedback by ID
    public Feedback getFeedback(int id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    // Get feedback for a specific doctor
    public List<Feedback> getFeedbackForDoctor(int doctorId) {
        return feedbackRepository.findByDoctor_DoctorId(doctorId);
    }
}
