package com;

public class TestStringBuffer {
    public static void main(String[] args) {
//        String s = "Mircosoft";
        String s = new String("Mircosoft");
        char[] x = {'a', 'b', 'c'};
        StringBuilder sb1 = new StringBuilder(s);
        sb1.append("/").append("IBM").append("/").append("Sun");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("数字");
        for (int i = 0; i < 10; i++) {
            sb2.append(i);
        }
        System.out.println(sb2);

        sb2.delete(8, sb2.length()).insert(0, x);
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
    }
}
