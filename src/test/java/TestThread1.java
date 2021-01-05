public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        t.start();  //线程启动必须调用start()方法
        for (int i = 0; i < 100; i++) {
            System.out.println("main Thread----" + i);
        }
    }
}


class Runner1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner1：" + i);
        }
    }
}
