package com;

class Cat extends Animal {
    private String eyesColor;

    Cat(String n, String c) {
        super(n);
        this.eyesColor = c;
    }

    public void enjoy() {
        System.out.println("猫叫声");
    }
}
