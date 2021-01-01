package com;

public class TestSearchStr {
    public static void main(String[] args) {
        String s = "sunpythonjavapythonpythonjavapythonpythonsdf";
        int count = 0;
        int index = -1;
        String toFind = "python";
        while (s.contains(toFind)) {
            index = s.indexOf(toFind);
            s = s.substring(index + toFind.length());
            count ++;
        }
        System.out.println(count);
    }
}
