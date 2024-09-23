package abstract_method.method_calling;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;

        mu= new Rahim();
        mu.dispaly();
        mu.sendMessage();

        mu= new Karim();
        mu.sendMessage();
        mu.dispaly();
    }
}
