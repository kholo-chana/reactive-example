package com.kholofelo;

import com.kholofelo.model.Invoice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveExampleApplication /*implements CommandLineRunner */{

	public static void main(String[] args) {
		SpringApplication.run(ReactiveExampleApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		//Save invoice
//		WebClient 	saveClient = WebClient.create("http://localhost:8080");
//		Mono<Invoice> saveMono= saveClient
//				.post()
//				.uri("/invoice/save")
//				.body(Mono.just(new Invoice(1, "Invoice1", "INV001", 2345.75)),Invoice.class)
//				.retrieve().bodyToMono(Invoice.class);
//		saveMono.subscribe(System.out::println);
//
//        //Get ALl Invoice
//		WebClient client = WebClient.create("http://localhost:8080");
//		Flux<Invoice> flux= client
//				.get()
//				.uri("/invoice/allInvoices")
//				.retrieve()
//				.bodyToFlux(Invoice.class);
//		flux.doOnNext(System.out::println).blockLast();
//
//
//		WebClient getOneInvoice= WebClient.create("http://localhost:8080");
//		Mono<Invoice> getMono= getOneInvoice
//				.get()
//				.uri("/invoice/get/2")
//				.retrieve()
//				.bodyToMono(Invoice.class);
//		getMono.subscribe(System.out::println);
//
//
//		//Delete One Invoice
//		WebClient deleteClient = WebClient.create("http://localhost:8080");
//		Mono<Void> deleteMono= deleteClient
//				.delete()
//				.uri("/invoice/delete/3")
//				.retrieve()
//				.bodyToMono(Void.class);
//			deleteMono.subscribe(System.out::println);
//			System.out.println("Invoice Deleted!");
//}
}
