import java.io.*;

public class TestFileWriter {
    public static void main(String[] args) {
        int b = 0;
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(
                    System.getProperty("user.dir") + "\\src\\test\\java\\TestFileInputStream.java");
            fw = new FileWriter(
                    System.getProperty("user.dir") + "\\src\\test\\java\\HelloWorld.java");
            while ((b=fr.read()) != -1){
                fw.write(b);
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已复制");
    }
}
