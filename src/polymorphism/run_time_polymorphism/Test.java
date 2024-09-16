package polymorphism.run_time_polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p= new Person();
        p.display();

//        Teacher t= new Teacher();
//        t.display();
//
//        Student s= new Student();
//        s.display();


        p = new Teacher();
        p.display();

        p= new Student();
        p.display();
    }
}
