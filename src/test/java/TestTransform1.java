import java.io.*;

public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                    System.getProperty("user.dir") +"\\date.txt"));
            osw.write("杨家禄");
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream(
                    System.getProperty("user.dir") +"\\date.txt", true),
                    "UTF8");
            osw.write("123444555556677梦涵");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
