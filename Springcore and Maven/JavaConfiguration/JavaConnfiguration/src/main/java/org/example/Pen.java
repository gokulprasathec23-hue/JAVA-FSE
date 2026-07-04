package org.example;

public class Pen implements Write{
    public Pen() {
        System.out.println("pen constructor");
    }
    @Override
    public void Writer() {
        System.out.println("Write Using Pen");
    }
}
