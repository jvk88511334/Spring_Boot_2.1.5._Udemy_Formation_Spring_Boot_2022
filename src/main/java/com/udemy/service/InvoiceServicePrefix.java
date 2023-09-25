package com.udemy.service;

import com.udemy.entity.Invoice;
import com.udemy.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {
    @Value("${invoice.lastnumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    @Qualifier("invoiceRepositoryDatabase")
    @Autowired
    private InvoiceRepositoryInterface invoiceRepositoryMichel;

    public InvoiceServicePrefix(@Qualifier("invoiceRepositoryDatabase") InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(prefix+(++lastNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
