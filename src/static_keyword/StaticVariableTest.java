package static_keyword;

public class StaticVariableTest {
    public static void main(String[] args){
//        StaticVariable std1= new StaticVariable();
//        System.out.println(std1.universityName);

//When I call static variable, I don't have to make any object. I direct call the class name than variable
//        System.out.println(StaticVariable.universityName);



        StaticVariable str1= new StaticVariable();
        str1.totalCount();
        StaticVariable str2= new StaticVariable();
        str2.totalCount();
        StaticVariable str3= new StaticVariable();
        str3.totalCount();
        StaticVariable str4= new StaticVariable();
        str4.totalCount();
    }
}
