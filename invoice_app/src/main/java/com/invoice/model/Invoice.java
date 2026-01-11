package com.invoice.model;

import java.util.List;

public class Invoice {

    private List<InvoiceItem> items;
    private double subTotal;
    private double tax;
    private double grandTotal;

    public Invoice(List<InvoiceItem> items) {
        this.items = items;
        this.subTotal = items.stream()
                .mapToDouble(InvoiceItem::getTotal)
                .sum();
        this.tax = subTotal * 0.18;
        this.grandTotal = subTotal + tax;
    }

    public List<InvoiceItem> getItems() { return items; }
    public double getSubTotal() { return subTotal; }
    public double getTax() { return tax; }
    public double getGrandTotal() { return grandTotal; }
}

