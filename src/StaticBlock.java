public class StaticBlock {
    static {
        System.out.println("This is static block.");
    }
    static void displayInfo(){
        System.out.println("This is static method.");
    }

    public static void main(String[] args) {
        System.out.println("Now I am in main.");
        StaticBlock.displayInfo();
    }
}
