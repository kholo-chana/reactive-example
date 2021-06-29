package com.kholofelo.repository;

import com.kholofelo.model.Invoice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInvoiceService {

    public Mono<Invoice> saveInvoice(Invoice invoice);

    public Flux<Invoice> findAllInvoices();

    public Mono<Invoice> getOneInvoice(Integer id);

    public Mono<Void> deleteInvoice(Integer id);
}
