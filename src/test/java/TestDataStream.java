import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        // 处理流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            // 先写的先读 队列   栈 先进后出
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
