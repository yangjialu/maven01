package com;

public class TestNum {
    public static void main(String[] args) {
        String s = "ASSDDFasdf  _12345455sdfgASDFFF";
        int lCount = 0, uCount = 0, oCount = 0;

        /*
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                lCount ++;
            }else if (Character.isUpperCase(c)) {
                uCount ++;
            }else {
                oCount ++;
            }
        }
        System.out.print(lCount + " " + uCount + " " + oCount);
         */

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lCount ++;
            }else if (c >= 'A' && c <= 'Z') {
                uCount ++;
            }else {
                oCount ++;
            }
        }
        System.out.print(lCount + " " + uCount + " " + oCount);
    }
}
