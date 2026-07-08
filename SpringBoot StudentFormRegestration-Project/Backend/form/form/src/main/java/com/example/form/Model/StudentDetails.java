package com.example.form.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String regno;
    private String collage;

    public StudentDetails(String name,String regno, String collage) {
        this.name = name;
        this.regno = regno;
        this.collage= collage;
    }

    public StudentDetails() {

    }
}
