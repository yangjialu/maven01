public class TT implements Runnable{
    int b = 100;

    public synchronized void m1() throws InterruptedException {
        //只能锁定当前方法
        b = 1000;
        Thread.sleep(3000);
        System.out.println("b = " + b);
    }

    public void m2() throws InterruptedException {
        Thread.sleep(1000);
        b = 2000;
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();

        tt.m2();
        System.out.println(tt.b);
    }
}
