package com.kanojo.controller.ba;

import com.kanojo.common.result.Result;
import com.kanojo.domain.ba.ProductionPlan;
import com.kanojo.service.ba.ProductionPlanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pp")
public class ProductionPlanController {
    @Resource
    private ProductionPlanService service;

    @PostMapping("/getAll")
    public Result getAll(@RequestBody(required = false) ProductionPlan productionPlan) {
        return Result.success(service.getAll(productionPlan));
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProductionPlan productionPlan) {
        return service.update(productionPlan) ? Result.success() : Result.failed();
    }
}
