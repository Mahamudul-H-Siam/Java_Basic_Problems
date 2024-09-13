package returning_value;

public class Call {
    public static void main(String[] args){
        ReturningValueDemo sqrt1= new ReturningValueDemo();
        ReturningValueDemo sqrt2= new ReturningValueDemo();
        ReturningValueDemo sqrt3= new ReturningValueDemo();

        System.out.println("The value of 3 is:"+ sqrt3.sqrt(3));
        System.out.println("The value of 7 is:"+ sqrt2.sqrt(7));
        System.out.println("The value of 5 is:"+ sqrt1.sqrt(5));
    }
}
