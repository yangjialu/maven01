package com;

public class TestSearchIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9, 10, 11, 12, 14};
        System.out.println(searchIndex(arr, 7));
    }

    // 查找一个数在数组中的位置
    public static int searchIndex(int[] a, int num) {
        if (a.length == 0) return -1;

        int startPos = 0;
        int endPos = a.length - 1;
        int m = (startPos + endPos)/2;
        while (startPos <= endPos) {
            if (num == a[m]) return m;
            if (num > a[m]) {
                startPos = m + 1;
            }
            if (num < a[m]) {
                endPos = m - 1;
            }
            m = (startPos + endPos)/2;
        }
        return -1;
    }
}
