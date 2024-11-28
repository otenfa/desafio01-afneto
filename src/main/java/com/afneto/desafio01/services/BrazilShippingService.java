package com.afneto.desafio01.services;

import org.springframework.stereotype.Service;

import com.afneto.desafio01.entities.Order;

@Service("brazilShippingService")
public class BrazilShippingService extends ShippingService {

	@Override
	public double shipment(Order order) {
		
		if (order.getBasic() < 100.00) {
			return 40.00;
		} else if (order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
			return 24.00;
		}else {
			return 10.00;
		}
	}
	
}
