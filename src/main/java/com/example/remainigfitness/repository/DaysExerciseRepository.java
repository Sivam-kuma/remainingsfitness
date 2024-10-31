package com.example.remainigfitness.repository;




import com.example.remainigfitness.entity.DaysExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DaysExerciseRepository extends JpaRepository<DaysExercise, Long> {

    // Custom query method to find all days exercises by userId
    List<DaysExercise> findByUserId(Long userId);
//    @Query("SELECT de.exerciseName FROM DayExercise de WHERE de.day = :day AND de.userId = :userId")
@Query("SELECT de.exerciseName FROM DaysExercise d " +
        "JOIN d.exercises de " +
        "WHERE d.userId = :userId AND de.day = :day")
List<String> findExerciseNamesByDay(@Param("day") String day, @Param("userId") Long userId);
}
