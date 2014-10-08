package com.packt.webstore.service;

import com.packt.webstore.domain.Order;

public interface OrderService {
	
	void processOrder(String  productId, long quantity);
	
	Long saveOrder(Order order);
}
