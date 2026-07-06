package com.example.JPA.Service;
import com.example.JPA.Model.Student;
import com.example.JPA.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
   @Autowired
   StudentRepo studentRepo;
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    public Student getbyNumber(int rno) {
        return studentRepo.findById(rno).orElse(new Student());
    }

    public void deleteId(int rno) {
        studentRepo.deleteById(rno);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
        //return student;
    }

    public List<Student> getstudentbyGender(String gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> getbyGenderandTechnology(String gender, String technology) {
        return studentRepo.findByGenderAndTechnology(gender, technology);
    }
}
