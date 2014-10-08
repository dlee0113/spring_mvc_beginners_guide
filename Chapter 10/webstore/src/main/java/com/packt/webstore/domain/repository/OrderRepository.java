package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Order;

public interface OrderRepository {
	Long saveOrder(Order order);
}
