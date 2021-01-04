import java.io.*;

public class TestObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\date1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\date1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tRead = (T)ois.readObject();
        System.out.println(tRead.i + " " + tRead.j + " " + tRead.d + " " + tRead.k);
    }
}


class T implements Serializable {
    //标记型接口
    int i = 10;
    int j = 9;
    double d = 2.3;
    transient int k = 15;  // transient修饰的不考虑值
}
