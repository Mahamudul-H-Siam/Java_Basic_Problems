package static_keyword;

public class Test {
    public static void main(String[] args){
        Student std1= new Student("Sami Abdullah", 1);
        Student std2= new Student("Sajuti Ahmad", 11);
        Student std3= new Student("Mahamudul Hasan", 111);

        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();
    }
}
