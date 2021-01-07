public interface JieKou1 {
    public abstract void sing();
    void sleep();

    public default void a() {
        System.out.println("这是非抽象方法");
    }

    public static void c() {
        System.out.println("这是静态方法");
    }
}


class TestInterface implements JieKou1 {
    @Override
    public void sing() {
        System.out.println("家唱歌");
    }

    @Override
    public void sleep() {
        System.out.println("我睡觉");
    }

    @Override
    public void a() {
        System.out.println("这是重写非抽象方法");
    } //非抽象方法重写不能加default，静态方法不能重写

    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.a();
        JieKou1.c();
    }
}
