package app.domain.port;

import app.domain.model.Order;


public interface OrderRepository {
	void save(Order order);
	Order findByOrderNumber(String orderNumber);
	boolean existsByOrderNumber(String orderNumber);
}
