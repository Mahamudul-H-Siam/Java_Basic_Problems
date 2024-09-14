package call_by_value_reference;

public class CallByReferenceCall {
//    public static void main(String[] args) {
//        CallByReference name1= new CallByReference();
//        name1.name= "Sami";
//        System.out.println("The Name is: " + name1.name);
//
//
//        name1.change(name1);
//        System.out.println("The rename name is: " + name1.name);
//    }


        public static void main(String[] args) {
            CallByReference nm1= new CallByReference();
            nm1.name= "Sami";
            System.out.println("Before change name: " + nm1.name);
            nm1.change(nm1);
            System.out.println("After change name: " + nm1.name);
        }
}
