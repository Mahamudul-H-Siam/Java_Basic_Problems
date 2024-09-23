package string_problems;

public class Contains {
    public static void main(String[] args) {
        String s1= "Mahamudul, 944, 2.77";
        String[] parts= s1.split(", ");

        String s2= "Sami Abudullah, 07, 5.00";
        String[] parts2= s2.split(", ");

        for (int i = 0; i < 3; i++) {
            System.out.println(parts[i]);
            System.out.println(parts2[i]);
        }
    }
}
