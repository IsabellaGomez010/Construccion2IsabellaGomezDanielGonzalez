package app.domain.repository;

import app.domain.model.Order;


public interface OrderRepository {
	void save(Order order);
	Order findByOrderNumber(String orderNumber);
	boolean existsByOrderNumber(String orderNumber);
}
