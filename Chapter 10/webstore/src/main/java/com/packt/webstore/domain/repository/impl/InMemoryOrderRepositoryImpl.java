package com.packt.webstore.domain.repository.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.packt.webstore.domain.Order;
import com.packt.webstore.domain.repository.OrderRepository;

@Repository
public class InMemoryOrderRepositoryImpl implements OrderRepository{

	private Map<Long, Order> listOfOrders;
	private long nextOrderId;
	
	public InMemoryOrderRepositoryImpl() {
		listOfOrders = new HashMap<Long, Order>();
		nextOrderId = 1000;
	}

	public Long saveOrder(Order order) {
		order.setOrderId(getNextOrderId());
		listOfOrders.put(order.getOrderId(), order);
		return order.getOrderId();
	}

	private synchronized long getNextOrderId() {
		return nextOrderId++;
	}
}
