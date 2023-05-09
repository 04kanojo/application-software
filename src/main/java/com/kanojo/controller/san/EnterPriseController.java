package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.service.san.EnterpriseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/enterprise")
public class EnterPriseController {
    @Resource
    private EnterpriseService service;

    @GetMapping("/list")
    public Result list() {
        return Result.success(service.list());
    }
}
