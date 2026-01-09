public class InvoiceApp {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        invoice.addItem(new InvoiceItem("Laptop", 1, 55000));
        invoice.addItem(new InvoiceItem("Mouse", 2, 500));
        invoice.addItem(new InvoiceItem("Keyboard", 1, 1500));

        invoice.printInvoice();
    }
}

