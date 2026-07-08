package com.example.form.Repositary;

import com.example.form.Model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails,Integer> {
}
