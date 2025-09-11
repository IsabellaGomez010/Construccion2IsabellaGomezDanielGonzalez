package app.domain.repository;

import app.domain.model.Order;

public interface OrderManagementPort {
	void createOrder(Order order);
	Order getOrderByNumber(String orderNumber);
}
