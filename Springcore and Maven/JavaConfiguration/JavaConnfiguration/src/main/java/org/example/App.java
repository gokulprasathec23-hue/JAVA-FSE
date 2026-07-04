package org.example;
import org.example.config.Myconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(Myconfig.class);
        Student stu =(Student) context.getBean("student");
        stu.WriteExam();
        //stu.WriteExam();
    }
}
