package super_class.super_class_method;

public class B extends A{
    @Override
    void display() {
        super.display();
        System.out.println("Inside B class.");
    }
}
