package polymorphism.shap;

public class Rectangle extends Shap{
    double length, width;

    Rectangle(double length, double width){
        this.length= length;
        this.width= width;
    }

    @Override
    double area() {
        System.out.println("Rectangle value is: ");
        return length * width;
    }
}
