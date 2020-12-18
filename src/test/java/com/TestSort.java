package com;

public class TestSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 7, 9, 8, 4, 6, 5};
        selectSort(a);
        print(a);
        bubbleSort(a);
        print(a);
    }

    // 选择排序
    private static void selectSort(int[] a) {
        int k, temp;
        for (int i = 0; i < a.length; i++){
            k = i;
            for (int j = k+1; j < a.length; j++) {
                if(a[j] < a[k]) {
                    k = j;
                }
            }
            if(k != i) {
                temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }
    // 冒泡排序
    private static void bubbleSort(int[] a) {
        int temp;
        for (int i = a.length-1; i >= 1 ; i--) {
            for (int j = 0; j <=i-1; j++) {
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

