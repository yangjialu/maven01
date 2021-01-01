package com;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        String sep = File.separator;
        String filename = "my.text";
        String dir = "mydir1" + sep + "mydir2";
        File f = new File(dir, filename);
        if (f.exists()) {
            System.out.println("文件名：" + f.getAbsolutePath());
            System.out.println("文件大小：" + f.length());
        }else {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
