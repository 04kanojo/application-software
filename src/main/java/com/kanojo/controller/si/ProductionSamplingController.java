package com.kanojo.controller.si;

import com.kanojo.service.si.ProductionSamplingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pro-sampling")
public class ProductionSamplingController {
    @Resource
    private ProductionSamplingService service;
}
