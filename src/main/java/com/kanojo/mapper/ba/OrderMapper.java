package com.kanojo.mapper.ba;

import com.kanojo.domain.ba.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> getAll(Order order);

    boolean update(Order order);
}




