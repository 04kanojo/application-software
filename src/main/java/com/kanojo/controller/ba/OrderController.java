package com.kanojo.controller.ba;

import com.kanojo.common.result.Result;
import com.kanojo.domain.ba.Order;
import com.kanojo.service.ba.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService service;

    @PostMapping("/getAll")
    public Result getAll(@RequestBody(required = false) Order order) {
        return Result.success(service.getAll(order));
    }

    @PostMapping("/update")
    public Result update(@RequestBody Order order) {
        return service.update(order) ? Result.success() : Result.failed();
    }
}
