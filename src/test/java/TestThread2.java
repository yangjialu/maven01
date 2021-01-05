public class TestThread2 {
    public static void main(String[] args) {
        Runner r = new Runner();
        r.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main Thread----" + i);
        }
    }
}


class Runner extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner：" + i);
        }
    }
}