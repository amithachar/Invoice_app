package com.invoice.service;

import com.invoice.model.Invoice;
import com.invoice.model.InvoiceItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    public Invoice generateInvoice(List<InvoiceItem> items) {
        return new Invoice(items);
    }
}

