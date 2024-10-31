package com.example.remainigfitness.services;


import com.example.remainigfitness.entity.ExerciseList;
import com.example.remainigfitness.repository.ExerciseListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseListService {
    @Autowired
    ExerciseListRepository exerciseListRepository;
    public List<ExerciseList> getAllExerciseList(String exerciseName){
        return exerciseListRepository.findByExerciseName(exerciseName);

    }
}
