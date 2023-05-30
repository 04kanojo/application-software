package com.kanojo.service.ba;

import com.kanojo.domain.ba.Order;

import java.util.List;


public interface OrderService {

    List<Order> getAll(Order order);

    boolean update(Order order);
}
