import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the Invoice Number: ");
            String invoiceNumber = scanner.nextLine();

            System.out.print("Enter the Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter the Product Price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Enter the Quantity: ");
            int quantity = scanner.nextInt();

            Buying purchase = new Buying(invoiceNumber, customerName, productName, productPrice, quantity);

            // Display purchase information
            purchase.displayInfo();
        } catch (Exception e) {
            System.out.println("Something is wrong: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class Buying {
    protected String invoiceNumber;
    protected String customerName;
    protected String productName;
    protected double productPrice;
    protected int quantity;

    public Buying(String invoiceNumber, String customerName, String productName, double productPrice, int quantity) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("-------------------------");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: Rp" + productPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rp" + calculateTotalPrice());
        System.out.println("-------------------------");
        System.out.println("Thanks!please come back");
    }

    public double calculateTotalPrice() {
        return productPrice * quantity;
    }
}