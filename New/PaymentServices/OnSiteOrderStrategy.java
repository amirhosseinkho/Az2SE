package PaymentServices;

public class OnSiteOrderStrategy implements PaymentStrategy {
    @Override
    public void register(String customerName) {
        System.out.println("On-Site order registered for " + customerName);
    }

    @Override
    public void pay(int amount) {
        System.out.println("On-Site Payment with price: " + amount + " Tomans!");
    }
}
