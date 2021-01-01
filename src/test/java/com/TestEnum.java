package com;

public class TestEnum {
    public enum MyColor {red, green, black};
    public static void main(String[] args) {
        MyColor m = MyColor.green;
        switch (m) {
            case red:
                System.out.println("red");
                break;
            case green:
                System.out.println("green");
                break;
            default:
                System.out.println("default");
        }
        System.out.println(m);
    }
}
