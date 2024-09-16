package super_class.instance_variable;

public class C extends B{
    int x= 5;

    @Override
    void display() {
        System.out.println("The number is : " + super.x);
    }
}
