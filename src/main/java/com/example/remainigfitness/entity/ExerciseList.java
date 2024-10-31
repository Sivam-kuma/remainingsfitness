package com.example.remainigfitness.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExerciseList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String exerciseName;
    private String exerciseDescription;
    private String equipmentType;

    public ExerciseList() {
    }

    public ExerciseList(int id, String exerciseName, String exerciseDescription, String equipmentType) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
        this.equipmentType = equipmentType;
    }

    public int getId() {
        return id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }
}

