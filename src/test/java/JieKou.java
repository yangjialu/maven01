public interface JieKou {
    // 接口中申明的属性默认是public static final，也只能是public static final
    public static final int id = 1;

    // 接口中只能定义抽象方法，而且这些方法默认是public的，也只能是public
    // 接口可以继承其他的接口，并添加新的属性和抽象方法
    public void start();
    public void run();
    public void stop();

    public default void sleep() {
        System.out.println("睡觉");
    }

    public static void eat() {
        System.out.println("吃饭");
    }
}
