import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String customerName = input.nextLine();

        System.out.print("Worker Name: ");
        String workersName = input.nextLine();

        System.out.print("Enter discount (%): ");
        double discountPercent = input.nextDouble();

        String[] items = new String[100];
        int[] quantities = new int[100];
        double[] prices = new double[100];
        double[] totals = new double[100];

        int count = 0;
        String choice;

        do {
            input.nextLine();

            System.out.print("Enter product name: ");
            items[count] = input.nextLine();

            System.out.print("Enter quantity: ");
            quantities[count] = input.nextInt();

            System.out.print("Enter price: ");
            prices[count] = input.nextDouble();

            totals[count] = quantities[count] * prices[count];

            count++;

            input.nextLine();

            System.out.print("Add more items? (yes/no): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        double subTotal = 0;

        for (int counter = 0; counter < count; counter++) {
            subTotal += totals[counter];
        }

        double discount = (discountPercent / 100) * subTotal;
        double vat = 0.075 * subTotal;
        double billTotal = subTotal - discount + vat;

        System.out.println("\n===== RECEIPT =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Worker: " + workersName);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT: " + vat);
        System.out.println("Total Bill: " + billTotal);
    }
}
