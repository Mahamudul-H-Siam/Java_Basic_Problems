package static_keyword;

public class StaticVariable {
//    static String universityName= "United International University";


    static int count= 0;

    StaticVariable(){
        count++;
    }

    void totalCount(){
        System.out.println("Count value is: " + count);
    }

}
