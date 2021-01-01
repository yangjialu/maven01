package com;

public class Test3Quit {
    public static void main(String[] args) {
        boolean[] arr = new boolean[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        int leftNum = arr.length;
        int countNum = 0;
        int index = 0;
        while (leftNum > 1) {
            if (arr[index] == true) {
                countNum ++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftNum --;
                }
            }

            index ++;
            if (index == arr.length) {
                index = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}
