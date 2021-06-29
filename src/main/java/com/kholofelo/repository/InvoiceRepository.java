package com.kholofelo.repository;

import com.kholofelo.model.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice,Integer> {
}
