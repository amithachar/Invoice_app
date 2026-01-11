package com.invoice.controller;

import com.invoice.model.Invoice;
import com.invoice.model.InvoiceItem;
import com.invoice.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public Invoice generateInvoice(@RequestBody List<InvoiceItem> items) {
        return service.generateInvoice(items);
    }
}
