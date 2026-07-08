package com.example.form.Controler;
import com.example.form.Model.StudentDetails;
import com.example.form.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class StudentController {
    @Autowired
    StudentService studentservice;

    @PostMapping("/students/details/add")
     public String studentsdetailsadd(@RequestBody  StudentDetails studentdetail){
        studentservice.studentdetailsadd(studentdetail);
        return "Student details added Success";
    }
    @DeleteMapping("/students/delete/{id}")
    public String studentDelete(@PathVariable("id") int id){
        String s =studentservice.studentdelete(id);
        return s;
    }
}
