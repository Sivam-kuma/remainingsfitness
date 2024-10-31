package com.example.remainigfitness.repository;
import com.example.remainigfitness.entity.ExerciseList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExerciseListRepository extends JpaRepository<ExerciseList, Integer> {
    List<ExerciseList> findByExerciseName(String exerciseName);
}
