package string_method;

public class Str {
    public static void main(String[] args){
        String firstName= "Samia";
        String secondName= "Bint";
        String thirdName= "Hamid";
        String name= new String("samia bint hamid");

        String fullName= firstName + " " + secondName + " " + thirdName;
        System.out.println(fullName);

//        length
        System.out.println("Length of the fullname string: " + fullName.length());

//        equals
        if(fullName.equals(name)){
            System.out.println("Equals");
        }
        else System.out.println("Not equals");

//        equalsIgnoreCase
        if(fullName.equalsIgnoreCase(name)){
            System.out.println("It is equal when case sensitivity are ignored");
        }

//        contains
        boolean contain= fullName.contains(secondName);
        System.out.println("Is fullname contains secondname: " + contain);

//        isEmpty

    }
;}
