package PaymentServices;

public class PhoneOrderStrategy implements PaymentStrategy {
    @Override
    public void register(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Phone Payment with price: " + amount + " Tomans!");
    }
}
