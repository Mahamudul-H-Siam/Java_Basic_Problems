package variable_length_argument;

public class VariableLength {

//    void add(int a, int b){
//        System.out.println(a + b);
//    }
//    void add(int a, int b, int c){
//        System.out.println(a + b +c);
//    }
//    void add(int a, int b, int c, int d){
//        System.out.println(a + b +c + d);
//    }


    void add(int ... num){
        int sum= 0;
        for(int i: num){
            sum+= i;
        }
        System.out.println(sum);
    }
}
