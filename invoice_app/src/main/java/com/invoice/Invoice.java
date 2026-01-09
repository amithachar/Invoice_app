import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<InvoiceItem> items = new ArrayList<>();
    private static final double TAX_RATE = 0.18; // 18% GST

    public void addItem(InvoiceItem item) {
        items.add(item);
    }

    public double getSubTotal() {
        double total = 0;
        for (InvoiceItem item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public double getTax() {
        return getSubTotal() * TAX_RATE;
    }

    public double getGrandTotal() {
        return getSubTotal() + getTax();
    }

    public void printInvoice() {
        System.out.println("----------- INVOICE -----------");
        System.out.printf("%-15s %5s %8s %10s%n", "Item", "Qty", "Price", "Total");

        for (InvoiceItem item : items) {
            System.out.printf("%-15s %5d %8.2f %10.2f%n",
                    item.getItemName(),
                    item.getQuantity(),
                    item.getPrice(),
                    item.getTotal());
        }

        System.out.println("--------------------------------");
        System.out.printf("Subtotal: %.2f%n", getSubTotal());
        System.out.printf("Tax (18%%): %.2f%n", getTax());
        System.out.printf("Grand Total: %.2f%n", getGrandTotal());
        System.out.println("--------------------------------");
    }
}

