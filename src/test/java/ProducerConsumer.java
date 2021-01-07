public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);
        new Thread(p).start();
        new Thread(c).start();
    }
}


class WoTou {
    int id;
    WoTou(int id) {
        this.id = id;
    }

    public String toString() {
        return "WoTou : " + id;
    }
}


class SyncStack {
    int index = 0;
    WoTou[] arr = new WoTou[6];

    public synchronized void push(WoTou wt) throws InterruptedException {
        while (index == arr.length) {
            this.wait();  // 当前对象执行的线程等待
        }
        this.notify();
        arr[index] = wt;
        index++;
    }

    public synchronized WoTou pop() throws InterruptedException {
        while (index == 0) {
            this.wait();
        }
        this.notify();
        index--;
        return arr[index];
    }
}

class Producer implements Runnable {
    SyncStack ss = new SyncStack();

    Producer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            WoTou wt = new WoTou(i);
            try {
                ss.push(wt);
                Thread.sleep(1000);
System.out.println("生产了：" + wt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    SyncStack ss = new SyncStack();

    Consumer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                WoTou wt = ss.pop();
                Thread.sleep(1000);
System.out.println("消费了：" + wt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}