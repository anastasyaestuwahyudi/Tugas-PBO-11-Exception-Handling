public class Membeli extends Buying implements TotalPayment {

    public Membeli(String invoiceNumber, String customerName, String productName, double productPrice, int quantity) {
        super(invoiceNumber, customerName, productName, productPrice, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return productPrice * quantity;

    }

    // Override metode displayInfo untuk menampilkan total pembayaran
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Payment: Rp" + calculateTotalPrice());
    }
}
