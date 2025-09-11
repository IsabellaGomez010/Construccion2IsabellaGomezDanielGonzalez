package app.application.usecase;

import app.domain.model.Order;
import app.domain.repository.OrderManagementPort;

public class OrderManagementUseCase implements OrderManagementPort {
	private final OrderManagementPort orderManagementPort;

	public OrderManagementUseCase(OrderManagementPort orderManagementPort) {
		this.orderManagementPort = orderManagementPort;
	}

	@Override
	public void createOrder(Order order) {
		if (orderManagementPort.getOrderByNumber(order.getOrderNumber()) != null) {
			throw new IllegalArgumentException("El número de orden ya existe");
		}

		if (!order.getOrderNumber().matches("\\d{1,6}")) {
			throw new IllegalArgumentException("Número de orden inválido");
		}

		java.util.Set<Integer> itemNumbers = new java.util.HashSet<>();
		for (app.domain.model.OrderItem item : order.getItems()) {
			if (!itemNumbers.add(item.getItemNumber())) {
				throw new IllegalArgumentException("No puede haber dos ítems con el mismo número en la orden");
			}
		}
		orderManagementPort.createOrder(order);
	}

	@Override
	public Order getOrderByNumber(String orderNumber) {
		return orderManagementPort.getOrderByNumber(orderNumber);
	}
}
