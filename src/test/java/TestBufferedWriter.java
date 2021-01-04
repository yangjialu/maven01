import java.io.*;


public class TestBufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                    System.getProperty("user.dir") +"\\date.txt"));
            BufferedReader br = new BufferedReader(new FileReader(
                    System.getProperty("user.dir") +"\\date.txt"));
            String s = null;
            for (int i = 0; i <=100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s=br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
