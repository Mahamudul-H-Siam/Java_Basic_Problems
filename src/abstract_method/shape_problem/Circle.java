package abstract_method.shape_problem;

public class Circle extends Shape{
    Circle(double dim1, double dim2){
        super(dim1, dim1);
    }

    @Override
    void area() {
        System.out.println("Circle area is: " + Math.PI * dim1 * dim1);
    }
}
