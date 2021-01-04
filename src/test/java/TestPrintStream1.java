import java.io.*;

public class TestPrintStream1 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\date.txt");
            ps = new PrintStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (ps != null) {
            System.setOut(ps);
        }
        int in = 0;
        for (char i = 0; i < 60000; i++) {
            System.out.print(i + " ");
            if (in++ >= 100) {
                System.out.println();
                in = 0;
            }
        }
    }
}
