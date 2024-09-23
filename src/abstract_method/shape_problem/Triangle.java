package abstract_method.shape_problem;

public class Triangle extends Shape{
    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    void area() {
        System.out.println("Triangel area is: " + 0.5 * dim1 * dim2);
    }
}
