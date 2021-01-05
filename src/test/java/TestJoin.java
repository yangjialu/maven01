public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2("t");
        t.start();
        try {
            t.join(); //等待线程执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("I am main thread");
        }
    }
}


class MyThread2 extends Thread {
    MyThread2(String s) {
        super(s);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am " + getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}