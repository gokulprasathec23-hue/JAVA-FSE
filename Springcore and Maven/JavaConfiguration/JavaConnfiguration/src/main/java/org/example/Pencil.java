package org.example;

public class Pencil implements Write{
    public Pencil() {
        System.out.println("pencil constructor is callled");
    }
    @Override
    public void Writer() {
        System.out.println("Write using Pencil");
    }
}
