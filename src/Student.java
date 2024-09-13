public class Student {
    String name, gender;
    int id;

    Student(String name, String gender, int id){
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    void displayInformation(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Gender: " + gender);
        System.out.println("Student ID: " + id);
        System.out.println("\n\n");
    }
}
