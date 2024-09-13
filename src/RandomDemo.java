import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand= new Random();

//       Generate 0 to 10
//        int randomNumber= rand.nextInt(10);
//        System.out.println("Random Number is: "+ randomNumber);



//      Generate 1 to 10
//        int randomNumber2= rand.nextInt(10) + 1;
//        System.out.println("Random Number is: " + randomNumber2);



//       Another way Random number generate
        int randomNumber3= (int) (Math.random() * 100) + 1;
        System.out.println(randomNumber3);
    }
}
