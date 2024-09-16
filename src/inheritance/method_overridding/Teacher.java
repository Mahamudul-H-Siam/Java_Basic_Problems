package inheritance.method_overridding;

public class Teacher extends Person{
//    String name;
//    int age;
    double salary;

    @Override
    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("\n\n\n");
    }
}
