package com.example.restaurantmanagement.repositories;

import org.example.machineCoding.restaurentMgmtSystem.models.Order;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findOrdersByCustomerSession(long customerSessionId);
}
