package string_method;

import java.util.Arrays;

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

//        contains (If string contains another string of him than it will be true)
        boolean contain= fullName.contains(secondName);
        System.out.println("Is fullname contains secondname: " + contain);

//        isEmpty (If string was empty it will be true)
        boolean empty= nothing.isEmpty();
        System.out.println("Is nothing is empty it will be returns: " + empty);

//        concate (It adds two strings together)
        System.out.println("First name concate last name: " + firstName.concat(thirdName));

//        toUpperCase (It makes full string uppercase)
        System.out.println("Fullname all character are uppercase: " + fullName.toUpperCase());

//        toLowerCase (It makes full string lowercase)
        System.out.println("Fullname all character are lowercase: "+ fullName.toLowerCase());

//        startsWith (If start character will be match my string than it will be true)
        Boolean start= fullName.startsWith(firstName);
        System.out.println("If fullname start with firstname return true, else false: " + start);

//        endsWith (If end character will be match my string than it will be true)
        Boolean end= fullName.endsWith("d");
        System.out.println("If fullname ends with thirdname then return true, else return false: " + end);

//        charAt (It points the index number value)
        System.out.print("My brother name is: ");
        System.out.print(fullName.charAt(0));
        System.out.print(fullName.charAt(1));
        System.out.print(fullName.charAt(2));
        System.out.print(fullName.charAt(3));
        System.out.println();

//        codePointAt (It's giving the index ascii value)
        System.out.println("I need 'B' ascii value. The value is: " + fullName.codePointAt(6));

//        indexOf (It gives me the index number of my string character which I want"
        System.out.println("I need index of 'H'. The index of 'H' is: " + fullName.indexOf('H'));

//        lastIndexOf (It gives the last index of a string)
        System.out.println("The last Index of fullname is: " + fullName.lastIndexOf("t"));

//        trim (It works when I want to remove spaces that I have given when I declare a String. It remover only starting and ending spaces)
        String country= " Mi country name is Bangladesh. ";
        System.out.println("I use trim method. Here is the result of trim method: " + country.trim());

//        replace (It will work when I want to replace a word in my given string)
        System.out.println("Here is the replaced word in my country string: " + country.replace('i', 'y'));

//        split (It is divided string what I want, It is so usefully)
        String[] store= country.split(" ");
        System.out.println("Here is the split version of 'fullname': " + Arrays.toString(store));
        for(String i : store){
            System.out.println(i);
        }
    }
;}
