package abstract_method.shape_problem;

public class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    void area() {
        System.out.println("Rectangle are is: " + dim1 * dim2);
    }
}
