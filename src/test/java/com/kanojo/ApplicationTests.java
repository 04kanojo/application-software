package com.kanojo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.kanojo.domain.OrderDelivery;
import com.kanojo.mapper.OrderDeliveryMapper;
import com.kanojo.mapper.OrderDetailMapper;
import com.kanojo.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApplicationTests {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Resource
    private OrderDeliveryMapper orderDeliveryMapper;

    @Test
    void select() {
        LambdaQueryWrapper<OrderDelivery> lqw = new LambdaQueryWrapper<>();
        lqw.groupBy(OrderDelivery::getOrderId);
        Long list = orderDeliveryMapper.selectCount(lqw);
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}
