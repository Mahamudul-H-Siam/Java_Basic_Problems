public class Constructor {
    String name, occupation;
    int salary;

    Constructor(){
        System.out.println("No information are there.");
    }

    Constructor(String name, int salary){
        this.name= name;
        this.salary= salary;
    }

    Constructor(String name, String occupation, int salary){
        this.name= name;
        this.occupation= occupation;
        this.salary= salary;
    }

    void displayInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Occupation: "+ occupation);
        System.out.println("Salary: "+ salary);
    }
}
