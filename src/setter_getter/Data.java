package setter_getter;

public class Data {
    String name;
    int salary;
    private int id;
    private String designation;

    public void setId(int id){
        this.id= id;
    }
    public void setDesignation(String designation){
        this.designation= designation;
    }

    public int getId(){
        return id;
    }
    public String getDesignation(){
        return designation;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
