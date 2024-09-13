package static_keyword;

public class Student {
    String name;
    int id;
    static String universityName= "UIU";

    Student(String name, int id){
        this.name= name;
        this.id= id;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University name: " + universityName);
        System.out.println();
    }
}
