package com.example.JPA.Repository;
import com.example.JPA.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    List<Student>findByGender(String gender);
    @Query(
            value = "SELECT * FROM student WHERE gender = :gender AND technology = :technology",
            nativeQuery = true
    )
    List<Student> findByGenderAndTechnology(
            @Param("gender") String gender,
            @Param("technology") String technology);
}
