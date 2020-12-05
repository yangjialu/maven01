package com;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("cat", "blue");
        Dog d = new Dog("dog", "black");
        Bird b = new Bird();
        Lady l1 = new Lady("l1", c);
        Lady l2 = new Lady("l2", d);
        Lady l3 = new Lady("l2", b);
        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}


class Lady {
    private String name;
    private Animal pet;
    Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void myPetEnjoy() {
        pet.enjoy();
    }
}
