import PaymentServices.*;

import java.util.Scanner;

public class PaymentMethodSelector {
    public PaymentStrategy selectPaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        PaymentStrategy paymentStrategy = null;
        int customerAnswerForPaymentMethod;

        // Step 2 : Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site and 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();

        if (customerAnswerForPaymentMethod == 1) {
            paymentStrategy = new OnlineOrderStrategy();
        } else if (customerAnswerForPaymentMethod == 2) {
            paymentStrategy = new OnSiteOrderStrategy();
        } else if (customerAnswerForPaymentMethod == 3) {
            paymentStrategy = new PhoneOrderStrategy();
        }

        return paymentStrategy;
    }
}
