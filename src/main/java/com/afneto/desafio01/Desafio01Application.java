package com.afneto.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.afneto.desafio01.entities.Order;
import com.afneto.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}
	
	@Autowired
	private OrderService orderService;
		
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Desafio 01 em execução!");
		System.out.println();
		
		Order o1 = new Order(1034, 150.00, 20.00);
		Order o2 = new Order(2282, 800.00, 10.00);
		Order o3 = new Order(1309, 95.90, 0.00);
		
		System.out.println("Pedido código " + o1.getCode());
		System.out.printf("valor total: R$ %.2f%n%n", orderService.total(o1));

		System.out.println("Pedido código " + o2.getCode());
		System.out.printf("valor total: R$ %.2f%n%n", orderService.total(o2));
		
		System.out.println();
		System.out.println("Pedido código " + o3.getCode());
		System.out.printf("valor total: R$ %.2f%n%n", orderService.total(o3));

		System.out.println("Desafio 01 concluído!");
		
	}

}
