package com.example.JPA.Controller;
import com.example.JPA.Model.Student;
import com.example.JPA.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    StudentServices studentservices;
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentservices.getStudents();
    }
    @GetMapping("students/{rno}")
    public Student getbyNumber(@PathVariable("rno") int rno){
        return studentservices.getbyNumber(rno);
    }
    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        studentservices.addStudent(student);
        return "Added Success";
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
         studentservices.updateStudent(student);
         return "Update Success";
    }
    @DeleteMapping("students/{rno}")
    public void deleteId(@PathVariable("rno") int rno){
        studentservices.deleteId(rno);
        //return "Delete id success";
    }
    @GetMapping("students/gender/{gender}")
    public List<Student> getstudentbyGender(@PathVariable("gender") String gender){
        return studentservices.getstudentbyGender(gender);
    }
    @GetMapping("/students/gender/technology")
    public List<Student> getByGenderAndTechnology(
            @RequestParam String gender,
            @RequestParam String technology) {
        return studentservices.getbyGenderandTechnology(gender, technology);
    }
}
