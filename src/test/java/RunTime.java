import java.io.*;
import java.util.ArrayList;

public class RunTime {
    public static void main(String[] args) throws IOException {
        ArrayList<String> out = new ArrayList<>();
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("adb devices");
        InputStream is = pr.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            out.add(line);
        }
        System.out.println(out);
    }
}
