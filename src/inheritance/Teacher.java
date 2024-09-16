package inheritance;

public class Teacher extends Person{
//    name, age, displayInfo
    String qualification;

    void displayInfo2(){
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);

        displayInfo();
        System.out.println("Qualification: " + qualification);
    }
}
