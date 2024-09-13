package problems;

public class Box {
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth){
        this.height= height;
        this.width= width;
        this.depth= depth;
    }

    void displayVol(){
        System.out.println("The box volume value is: " + height * width * depth);
    }
}
