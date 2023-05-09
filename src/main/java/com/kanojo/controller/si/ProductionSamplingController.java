package com.kanojo.controller.si;

import com.kanojo.common.result.Result;
import com.kanojo.domain.si.ProductionSampling;
import com.kanojo.service.si.ProductionSamplingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pro-sampling")
public class ProductionSamplingController {
    @Resource
    private ProductionSamplingService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) ProductionSampling productionSampling) {
        return Result.success(service.list(productionSampling));
    }
}
