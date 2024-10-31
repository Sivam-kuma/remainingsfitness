package com.example.remainigfitness.repository;




import com.example.remainigfitness.entity.DaysExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DaysExerciseRepository extends JpaRepository<DaysExercise, Long> {

    // Custom query method to find all days exercises by userId
    List<DaysExercise> findByUserId(Long userId);
}
