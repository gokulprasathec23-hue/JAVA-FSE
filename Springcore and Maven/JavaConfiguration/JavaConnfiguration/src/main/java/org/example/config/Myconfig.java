package org.example.config;
import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Write;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Writer;

@Configuration
public class Myconfig {
    @Bean
    public Student student(Write writer) {
        Student st = new Student();
        st.setWriter(writer);
        //st.setWriter(pencil());
        return st;
    }
    @Bean
    public Pen pen(){
        return new Pen();
    }

}
