package PaymentServices;

public interface PaymentStrategy {
    void register(String customerName);
    void pay(int amount);
}
