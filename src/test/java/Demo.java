import static com.codeborne.selenide.Selenide.*;


public class Demo {
    public static void main(String[] args) {
        int m = 0;
        int i = 20; int j = 18;
        int i1 = i++;
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);

        int i2 = ++i;
        System.out.println("i2 = " + i2);
        System.out.println("i = " + i);
        int j2 = --j;
        System.out.println("j = " + j);
        System.out.println("j2 = " + j2);
        int j3 = j--;
        System.out.println("j3 = " + j3);
        System.out.println("j = " + j);


    }



}
