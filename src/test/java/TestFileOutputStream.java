import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:\\maven01\\src\\test\\java\\TestFileInputStream.java");
            out = new FileOutputStream("E:\\maven01\\src\\test\\java\\HelloWorld.java");
            while ((b=in.read()) != -1){
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已复制");
    }
}
