package com.kanojo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kanojo.domain.OrderDetail;
import com.kanojo.service.OrderDetailService;
import com.kanojo.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;


@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




