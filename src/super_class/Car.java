package super_class;

public class Car extends Vehicals {
    int gear;

    Car(String color, double weight, int gear){
        super(color, weight);
        this.gear= gear;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Gear: " + gear);
    }
}
