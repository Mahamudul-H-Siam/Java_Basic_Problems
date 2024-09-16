package super_class;

public class CarName extends Car {
    String name;
    CarName(String color, double weight, int gear, String name){
        super(color, weight, gear);
        this.name= name;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Car Name: " + name);
    }
}
