import java.util.Scanner;

public class OrderProcessor {
    public Order takeOrder() {
        Scanner scanner = new Scanner(System.in);
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        // Step 1 : Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }
        }

        return order;
    }
}
