package super_class.instance_variable;

public class B extends A{
    int x= 10;

    @Override
    void display() {
        System.out.println("The number is : " + super.x);
    }
}
