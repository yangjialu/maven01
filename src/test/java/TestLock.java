public class TestLock implements Runnable {
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestLock test = new TestLock();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}


class Timer {
    private static int num = 0;
    public synchronized void add(String name) {
        //synchronized (this){
            //执行该方法过程中当前对象被锁定
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ", 你是第" + num + "个使用Timer的线程");
       // }
    }
}