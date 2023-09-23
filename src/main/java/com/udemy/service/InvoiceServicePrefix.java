package com.udemy.service;

import com.udemy.entity.Invoice;
import com.udemy.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface {
    private static long lastNumber=112L;

    public InvoiceRepositoryInterface getInvoiceRepositoryMichel() {
        return invoiceRepositoryMichel;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }

    private InvoiceRepositoryInterface invoiceRepositoryMichel;
    public void createInvoice(Invoice invoice){
        invoice.setNumber("INV_"+(++lastNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
