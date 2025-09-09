package app.application.usecase;

import app.application.port.in.OrderManagementUseCase;
import app.domain.model.Order;
import app.domain.repository.OrderRepository;

public class OrderManagementService implements OrderManagementUseCase {
	private final OrderRepository orderRepository;

	public OrderManagementService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public void createOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public Order getOrderByNumber(String orderNumber) {
		return orderRepository.findByOrderNumber(orderNumber);
	}
}
