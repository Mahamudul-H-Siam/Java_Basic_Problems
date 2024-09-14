package variable_length_argument;

public class VariableLengthTest {
    public static void main(String[] args) {
        VariableLength ob1= new VariableLength();

        ob1.add(10, 10);
        ob1.add(10, 10, 20);
        ob1.add(10, 10, 20, 20);
    }
}
