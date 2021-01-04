import java.io.*;

public class TestBufferedInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\date.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println(bis.read());
            System.out.println(bis.read());
            bis.mark(100);
            for (int i = 0; i <= 10 && (bis.read()) != -1 ; i++) {
                System.out.print(c + " ");
            }
            System.out.println();
            bis.reset();
            for (int i = 0; i <= 10 && (bis.read()) != -1 ; i++) {
                System.out.print(c + " ");
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
