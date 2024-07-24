import PaymentServices.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        PaymentMethodSelector paymentMethodSelector = new PaymentMethodSelector();

        Order order = orderProcessor.takeOrder();
        PaymentStrategy paymentStrategy = paymentMethodSelector.selectPaymentMethod();

        // Register Order
        paymentStrategy.register(order.customerName);

        // Step 3: pay price
        System.out.println("Pay Price:");
        paymentStrategy.pay(order.getTotalPrice());

        // Finally Print Bill
        System.out.println(order);
    }
}
