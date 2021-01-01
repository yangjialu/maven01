import java.util.*;

public class TestElementNum {
    public static void main(String[] args) {
        String s = "asdfdbfufblkseeereiojiklmnlnncnjdkdndjddnl";
        Map m = new HashMap();

        /*
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, m.get(c) == null? 1: (Integer)m.get(c) + 1);
        }
        System.out.println(m);
        System.out.println(m.get('d'));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
         */
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.get(arr[i]) == null? 1:(Integer)m.get(arr[i]) + 1);
        }
        System.out.println("单词数：" + m.size());
        System.out.println(m);
    }
}
