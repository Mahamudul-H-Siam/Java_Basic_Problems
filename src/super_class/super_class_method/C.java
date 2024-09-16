package super_class.super_class_method;

public class C extends B{
    @Override
    void display() {
        super.display();
        System.out.println("Inside C class.");
    }
}
