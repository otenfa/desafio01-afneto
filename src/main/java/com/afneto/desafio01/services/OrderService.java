package com.afneto.desafio01.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.afneto.desafio01.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(@Qualifier("brazilShippingService") ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		
		return order.getBasic() 
				- (order.getBasic()*(order.getDiscount()/100)) 
				+ shippingService.shipment(order);
	}
			
}
