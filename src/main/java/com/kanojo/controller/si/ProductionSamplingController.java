package com.kanojo.controller.si;

import com.kanojo.common.result.Result;
import com.kanojo.domain.si.ProductionSampling;
import com.kanojo.service.si.ProductionSamplingService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    public Result update(@RequestBody ProductionSampling productionSampling) {
        return service.update(productionSampling) ? Result.success() : Result.failed();
    }

    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable Long id) {
        return Result.success(service.getById(id));
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ProductionSampling productionSampling) {
        return service.add(productionSampling) ? Result.success() : Result.failed();
    }
}
