package inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1= new Teacher();
        t1.name= "Mahamudul Hasan Siam";
        t1.age= 21;
        t1.qualification= "BSC in CSE";

        Teacher t2= new Teacher();
        t2.name= "Sami Abdullah";
        t2.age= 10;
        t2.qualification= "Class three pass";

        t1.displayInfo2();
        t2.displayInfo2();
    }
}
