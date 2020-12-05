package com;

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    //public void enjoy() {System.out.println("叫声");}

    public abstract void enjoy();
}


//抽象类不能实例化，抽象方法只需申明，不需实现，含有抽象方法的类必须被申明为抽象类，抽象类必须被继承，抽象方法必须被重写

