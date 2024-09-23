package abstract_method.shape_problem;

import super_class.instance_variable.C;

public class Test {
    public static void main(String[] args) {
        Shape s1;
        s1= new Rectangle(2, 3);
        s1.area();

        s1= new Triangle(2, 3);
        s1.area();

        s1= new Circle(2, 3);
        s1.area();

    }
}
