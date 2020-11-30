public class add {
    public static void main(String[] args) {
        // 输出101到200内的质数。。。
        int count =0;
        for (int i=101; i<200; i++) {
            boolean f = true;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                count++;
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println("一共有" + count + "个质数");
    }
}
