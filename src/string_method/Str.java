package string_method;

public class Str {
    public static void main(String[] args){
        String firstName= "Samia";
        String secondName= "Bint";
        String thirdName= "Hamid";
        String name= new String("samia bint hamid");
        String nothing= "";

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
        boolean empty= nothing.isEmpty();
        System.out.println("Is nothing is empty it will be returns: " + empty);

//        concate
        System.out.println("First name concate last name: " + firstName.concat(thirdName));

//        toUpperCase
        System.out.println("Fullname all character are uppercase: " + fullName.toUpperCase());

//        toLowerCase
        System.out.println("Fullname all character are lowercase: "+ fullName.toLowerCase());

//        startsWith
        Boolean start= fullName.startsWith(firstName);
        System.out.println("If fullname start with firstname return true, else false: " + start);

//        endsWith
        Boolean end= fullName.endsWith("d");
        System.out.println("If fullname ends with thirdname then return true, else return false: " + end);
    }
;}
