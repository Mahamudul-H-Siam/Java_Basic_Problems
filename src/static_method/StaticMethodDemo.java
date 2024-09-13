//Static Method

//package static_method;
//
//public class StaticMethodDemo {
//    void display1(){
//        System.out.println("This is not a static method.");
//    }
//
//    static void display2(){
//        System.out.println("This is a static method.");
//    }
//}







//Static Method restrictions

package static_method;

public class StaticMethodDemo {
    static int x= 34;
    void display1(){
        display2();
        System.out.println("This is not a static method.");
    }

    static void display2(){
        System.out.println("Value of X is: " + x);
        System.out.println("This is a static method.");
    }
}
