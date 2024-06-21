package my.ecommerce.orderservice.service;

import my.ecommerce.orderservice.dto.OrderDto;
import my.ecommerce.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
