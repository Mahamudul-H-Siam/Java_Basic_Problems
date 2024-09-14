public class MethodOverloading {
    void add(){
        System.out.println("Nothing in add method.");
    }
    void add(int a, int b){
        System.out.println(a + b);
    }
    void add(double a, double b){
        System.out.println(a + b);
    }
    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOverloading add1= new MethodOverloading();
        add1.add();
        add1.add(10, 30);
        add1.add(1.51, 3.51);
        add1.add(10, 100, 1000);
}
}
