package com.example.form.Service;

import com.example.form.Model.StudentDetails;
import com.example.form.Repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentrepo;

    public void studentdetailsadd(StudentDetails studentdetails) {
        studentrepo.save(studentdetails);
    }

    public String studentdelete(int id) {
        if (!studentrepo.findById(id).isPresent()) {
            return "Student not found";
        } else {
            studentrepo.deleteById(id);
            return "Student deleted successfully";
        }
    }
}
