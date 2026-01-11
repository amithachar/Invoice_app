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

    @GetMapping("/test")
    public String test() {
        return "Invoice app is running";
    }

    @PostMapping("/generate")
    public Invoice generate(@RequestBody List<InvoiceItem> items) {
        return service.generateInvoice(items);
    }
}

