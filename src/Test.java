public class Test {
    public static void main(String[] args) {
////       object declare
//        Teacher teacher1;
////       object create
//        teacher1= new Teacher();
//
////        teacher1.name= "Mahamudul Hasan Siammmmm";
////        teacher1.gender= "Male";
////        teacher1.phone= 1882359241;
//        teacher1.setInformation("Mahamudul Hasan Siammmmmm", "Male", 1882359241);
//        teacher1.displayInformation();
//
//
//        Teacher teacher2= new Teacher();
////        teacher2.name= "Samia Bint Hamidddddd";
////        teacher2.gender= "Female";
////        teacher2.phone= 1516546212;
//        teacher2.setInformation("Samia Bint Hamiddddddd", "Female", 112330944);
//        teacher2.displayInformation();




//        Teacher teacher1= new Teacher();
//        teacher1.setInformation("Mahamudul Hasan Siam", "Male", 112330944);
//        teacher1.displayInformation();
//
//        Teacher teacher2= new Teacher();
//        teacher2.setInformation("Samia Bint Hamid", "Female", 112330944);
//        teacher2.displayInformation();
//
//        Teacher teacher3= new Teacher();
//        teacher3.setInformation("Mahamudul Hasan Siam", "Male", 112330944);
//        teacher3.displayInformation();
//
//        Teacher teacher4= new Teacher();
//        teacher4.setInformation("Samia Bint Hamid", "Female", 112330944);
//        teacher4.displayInformation();


        Teacher teacher1= new Teacher("Samia Bint Hamid", "Female", 112330944);
        teacher1.displayInformation();

        Teacher teacher2= new Teacher("Samia Bint Hamid", "Female", 112330944);
        teacher2.displayInformation();

        Teacher teacher3= new Teacher("Mahamudul Hasan Siam", "Male", 112330944);
        teacher3.displayInformation();

        Teacher teacher4= new Teacher("Mahamudul Hasan Siam", "Male", 112330944);
        teacher4.displayInformation();

//        Default constructor called here
        Teacher teacher5= new Teacher();
    }
}
