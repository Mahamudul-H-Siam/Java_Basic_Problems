package polymorphism.shap;

public class Test {
    public static void main(String[] args) {
//        Shap s1 = new Shap();
//        Rectangle r1= new Rectangle(2, 3);
//        Triangle t1= new Triangle(2, 5);



        Shap[] s= new Shap[5];

        s[0]= new Shap();
        s[1]= new Rectangle(10, 10);
        s[2]= new Triangle(10,20);

        for(int i= 0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
