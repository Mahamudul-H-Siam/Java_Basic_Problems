package polymorphism.shap;

public class Triangle extends Shap{
    double base, height;

    Triangle(double base, double height){
        this.base= base;
        this.height= height;
    }

    @Override
    double area() {
        System.out.println("Triangle value is: ");
        return 0.5 * base *height;
    }
}
