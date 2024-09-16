package inheritance.method_overridding;

public class Test {
    public static void main(String[] args) {
        Teacher t1= new Teacher();
        t1.name= "Sami Abdullah";
        t1.age= 10;
        t1.salary= 2000000.5000;
        t1.displayInformation();



        Person p1= new Person();
        p1.name= "Samia Bint Hamid";
        p1.age= 21;
        p1.displayInformation();
    }
}
