public class ConstructorCall {
        public static void main(String[] args){
            Constructor person1= new Constructor();
            Constructor person2= new Constructor("Samia", 0);
            Constructor person3= new Constructor("Samia", "Teacher", 1000000);

            person2.displayInformation();
            person3.displayInformation();
        }
}
