import java.io.*;

public class TestFileReader {
    public static void main(String[] args) {
        int b = 0;
        FileReader fr = null;
        try {
            fr = new FileReader(
                    System.getProperty("user.dir") + "\\src\\test\\java\\TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            while ((b=fr.read()) != -1){
                System.out.print((char)b);
                num ++;
            }
            fr.close();
            System.out.println();
            System.out.println("共读取了" + num + "个字节");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
