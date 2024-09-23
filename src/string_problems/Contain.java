package string_problems;

public class Contain {
    public static void main(String[] args) {
        String s1 ="Abc"; // "", "A", "b", "c", "Ab","bc", "Abc"
//        String s2 = "xyaAbcdg";

//      boolean b =  s2.contains(s1);
//        System.out.println(b);
//
//        int index = s2.indexOf(s1);
//        System.out.println(index);
//
//        char[] s = s2.toCharArray();
        //350057abd
        //351057ab
        // "35" +"1" + "057abd"

        String s2 ="xyzABCfdg";
        String s3 = s2.substring(0,3);
        System.out.println(s3);
        System.out.println(s2.substring(3, 6));
        System.out.println(s3.substring(6));
    }
}
