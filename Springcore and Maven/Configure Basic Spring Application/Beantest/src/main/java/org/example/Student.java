package org.example;

public class Student {
    private int mark;
    private Pen pen;
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public void writeExam(){
       pen.Write();
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void show(){
        System.out.println("I am student");
    }
}
