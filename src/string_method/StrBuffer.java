package string_method;

public class StrBuffer {
    public static void main(String[] args){
//        StringBuffer (When I want to add something in a String I have to declare another string. And than I apply my string method. But I want to apply my main string. So this StringBuffer is the process where I apply any method in original string)
        String str1= "My country name is Bangladesh.";
        StringBuffer ab= new StringBuffer(str1);
        System.out.println(ab);
        ab.append(" Dhaka is the capital city of Bangladesh. ");
        System.out.println(ab);
        ab.append("There are 64 district in Bangladesh.");
        System.out.println(ab);


        ab.setLength(5);
        System.out.println(ab);


        ab.setCharAt(0, 'm');
        System.out.println(ab);
    }
}
