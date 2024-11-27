package com.afneto.desafio01.services;

import org.springframework.stereotype.Service;

import com.afneto.desafio01.entities.Order;

@Service
public class OrderService {

	private ShippingService ss;
	
	public OrderService(ShippingService ss) {
		this.ss = ss;
	}

	public double total(Order order) {
		
		return order.getBasic() 
				- (order.getBasic()*(order.getDiscount()/100)) 
				+ ss.shipment(order);
	}

	
}
