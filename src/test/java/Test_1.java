public class Test_1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Double d = new Double("123.25");
        int j = i + d.intValue();
        float f = i.floatValue() + d.floatValue();
        System.out.println(j); System.out.println(f);
        double pi = Double.parseDouble("123.45");
        double r = Double.parseDouble("123.47");
        double s = pi*r*r;
        System.out.println(s);
        int k = Integer.parseInt("12");
        System.out.println(k);
        System.out.println(Integer.toBinaryString(123) + "B");
        System.out.println(Integer.toHexString(123) + "H");
        System.out.println(Integer.toOctalString(123) + "O");
    }
}
