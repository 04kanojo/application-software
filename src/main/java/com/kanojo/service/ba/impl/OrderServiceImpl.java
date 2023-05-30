package com.kanojo.service.ba.impl;

import com.kanojo.domain.ba.Order;
import com.kanojo.mapper.ba.OrderMapper;
import com.kanojo.service.ba.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper mapper;

    @Override
    public List<Order> getAll(Order order) {
        return mapper.getAll(order);
    }

    @Override
    public boolean update(Order order) {
        return mapper.update(order);
    }
}




