public class Teacher {
//    String name, gender;
//    int phone;
//
//    void setInformation(String n, String gen, int ph){
//        name= n;
//        gender= gen;
//        phone= ph;
//    }
//
//    void displayInformation(){
//        System.out.println("Name: " + name);
//        System.out.println("Gender: " + gender);
//        System.out.println("Phone: " + phone);
//        System.out.println("\n\n");
//    }




    String name, gender;
    int id;

//    void setInformation(String n, String gen, int roll){
//        name= n;
//        gender= gen;
//        id= roll;
//    }

//    Default constructor
    Teacher(){
        System.out.println("No data passed here.");
    }

//    Parametrized constructor
    Teacher(String n, String gen, int roll){
        name= n;
        gender= gen;
        id= roll;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("ID: " + id);
        System.out.println("\n\n");
    }
}
