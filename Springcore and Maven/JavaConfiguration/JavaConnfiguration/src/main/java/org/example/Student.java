package org.example;

public class Student {
    public Student(){
        System.out.println("Constructor called");
    }
    private Write writer;

    public Write getWriter() {
        return writer;
    }

    public void setWriter(Write writer) {
        this.writer = writer;
    }
    public void WriteExam(){
        writer.Writer();
    }
}
