package com;

public class TestStringBuffer {
    public static void main(String[] args) {
        String s = "Mircosoft";
        char[] x = {'a', 'b', 'c'};
        StringBuffer sb1 = new StringBuffer(s);
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
