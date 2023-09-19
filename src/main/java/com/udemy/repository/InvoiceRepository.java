package com.udemy.repository;

import com.udemy.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {
    private static List<Invoice> invoices = new ArrayList<>();

    private void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
