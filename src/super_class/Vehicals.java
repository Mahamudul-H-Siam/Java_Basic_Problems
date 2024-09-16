package super_class;

public class Vehicals {
    String color;
    double weight;

    Vehicals(String color, double weight){
        this.color= color;
        this.weight= weight;
    }

    void attribute(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
