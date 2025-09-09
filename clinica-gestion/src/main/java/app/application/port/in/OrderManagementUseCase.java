package app.application.port.in;

import app.domain.model.Order;

public interface OrderManagementUseCase {
	void createOrder(Order order);
	Order getOrderByNumber(String orderNumber);
}
