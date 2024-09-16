package inheritance;

public class People {
    private String name;
    private int age;

    public void setName(String name){
        this.name= name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    void displayInfo1(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
