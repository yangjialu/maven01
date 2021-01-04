import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestListMethod {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        for (int i = 0; i <= 9; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        Collections.shuffle(l1); //随机排列
        System.out.println(l1);
        Collections.reverse(l1); // 逆序排列
        System.out.println(l1);
        Collections.sort(l1); // 从低到高排序
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1, "a8")); // 折半查找
    }
}
