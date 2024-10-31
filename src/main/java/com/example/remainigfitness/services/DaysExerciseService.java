package com.example.remainigfitness.services;


import com.example.remainigfitness.entity.DaysExercise;
import com.example.remainigfitness.repository.DaysExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DaysExerciseService {

    @Autowired
    private DaysExerciseRepository daysExerciseRepository;

    // Get all days exercises by userId
    public List<DaysExercise> getAllDaysExercisesByUserId(Long userId) {
        return daysExerciseRepository.findByUserId(userId);
    }

    // Save a new days exercise for a user (creates a new entry for each userId)
    public DaysExercise saveDaysExercise(DaysExercise daysExercise) {
        return daysExerciseRepository.save(daysExercise);
    }

    // Get a specific days exercise by id
    public Optional<DaysExercise> getDaysExerciseById(Long id) {
        return daysExerciseRepository.findById(id);
    }

    // Update an existing days exercise
    public DaysExercise updateDaysExercise(Long id, DaysExercise daysExercise) {
        if (daysExerciseRepository.existsById(id)) {
            daysExercise.setId(id);
            return daysExerciseRepository.save(daysExercise);
        }
        return null; // or throw an exception if preferred
    }

    public List<String> getExerciseNamesByDay(String day, Long userId) {
        return daysExerciseRepository.findExerciseNamesByDay(day, userId);
    }
}

