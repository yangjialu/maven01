package com;

public class Dog extends Animal {
    private String furColor;

    Dog(String n, String c) {
        super(n);
        this.furColor = c;
    }

    public void enjoy() {
        System.out.println("狗叫声");
    }
}
