package com.example.remainigfitness.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "days_exercises")
public class DaysExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    // One-to-Many relationship with DayExercise
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "days_exercise_id")  // Foreign key in day_exercise_mapping
    private List<DayExercise> exercises;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<DayExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<DayExercise> exercises) {
        this.exercises = exercises;
    }
}

