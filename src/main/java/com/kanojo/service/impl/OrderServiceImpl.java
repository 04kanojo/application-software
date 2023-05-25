package com.kanojo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kanojo.domain.Order;
import com.kanojo.service.OrderService;
import com.kanojo.mapper.OrderMapper;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




