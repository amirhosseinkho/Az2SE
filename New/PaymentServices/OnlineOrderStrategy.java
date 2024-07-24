package PaymentServices;

public class OnlineOrderStrategy implements PaymentStrategy {
    @Override
    public void register(String customerName) {
        System.out.println("Online order registered for " + customerName);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Online Payment with price: " + amount + " Tomans!");
    }
}
