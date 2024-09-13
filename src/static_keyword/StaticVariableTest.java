package static_keyword;

public class StaticVariableTest {
    public static void main(String[] args){
//        StaticVariable std1= new StaticVariable();
//        System.out.println(std1.universityName);

//When I call static variable, I don't have to make any object. I direct call the class name than variable
        System.out.println(StaticVariable.universityName);
    }
}
