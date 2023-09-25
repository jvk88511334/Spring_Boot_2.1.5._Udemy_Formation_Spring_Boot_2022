package com.udemy.repository;

import com.udemy.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("DB -> Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
