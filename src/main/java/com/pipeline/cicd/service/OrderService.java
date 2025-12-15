package com.pipeline.cicd.service;

import com.pipeline.cicd.model.Order;
import com.pipeline.cicd.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        return orderRepository.save(order);
    }

    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return price * quantity;
    }

}
