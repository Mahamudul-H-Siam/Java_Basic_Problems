package string_problems;

public class Convertion {
    public static void main(String[] args) {
        int a =10;
        long l = 12324354;
        boolean b= true;
        //Another data type to String convert
        String s1 = a + ""; // String.valueof(a)
        String s2 = l + "";
        String s3 = String.valueOf(b);

        //String to other data type convert

        String s4 = "123";
        String s5 = "5.3435";

        int a1 = Integer.parseInt(s4);
        System.out.println();
        float f = Float.parseFloat(s5);
        boolean b1 = Boolean.parseBoolean(s3);

        System.out.println(f);
    }
}
