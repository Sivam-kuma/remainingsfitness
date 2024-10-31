package com.example.remainigfitness.controller;


import com.example.remainigfitness.entity.DaysExercise;
import com.example.remainigfitness.services.DaysExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/days-exercises")
public class DaysExerciseController {

    @Autowired
    private DaysExerciseService daysExerciseService;

    // Get all days exercises by userId
    @GetMapping("/user/{userId}")
    public List<DaysExercise> getAllDaysExercisesByUserId(@PathVariable Long userId) {
        return daysExerciseService.getAllDaysExercisesByUserId(userId);
    }

    // Save a new days exercise
    @PostMapping
    public DaysExercise saveDaysExercise(@RequestBody DaysExercise daysExercise) {
        return daysExerciseService.saveDaysExercise(daysExercise);
    }

    // Get a specific days exercise by id
    @GetMapping("/{id}")
    public ResponseEntity<DaysExercise> getDaysExerciseById(@PathVariable Long id) {
        return daysExerciseService.getDaysExerciseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update an existing days exercise
    @PutMapping("/{id}")
    public ResponseEntity<DaysExercise> updateDaysExercise(@PathVariable Long id, @RequestBody DaysExercise daysExercise) {
        DaysExercise updatedExercise = daysExerciseService.updateDaysExercise(id, daysExercise);
        return updatedExercise != null ? ResponseEntity.ok(updatedExercise) : ResponseEntity.notFound().build();
    }
    @GetMapping("/day/{day}/{userId}")
    public ResponseEntity<List<String>> getExercisesByDay(@PathVariable String day, @PathVariable Long userId) {
        List<String> exercises = daysExerciseService.getExerciseNamesByDay(day, userId);
        return ResponseEntity.ok(exercises);
    }
}
