package static_method;

public class StaticMethodDemoTest {
    public static void main(String[] args) {
//        Creating object for non-static method
        StaticMethodDemo a1= new StaticMethodDemo();
        a1.display1();

//        Call Class for static Method
        StaticMethodDemo.display2();
    }
}
