package com.kanojo.controller.si;

import com.kanojo.common.result.Result;
import com.kanojo.domain.si.QualityInspectionStandards;
import com.kanojo.service.si.QualityInspectionStandardsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/qis")
public class QualityInspectionStandardsController {
    @Resource
    private QualityInspectionStandardsService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) QualityInspectionStandards qualityInspectionStandards) {
        return Result.success(service.list(qualityInspectionStandards));
    }

    @PostMapping("/update")
    public Result update(@RequestBody QualityInspectionStandards qualityInspectionStandards) {
        return service.update(qualityInspectionStandards) ? Result.success() : Result.failed();
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
    public Result add(@RequestBody QualityInspectionStandards qualityInspectionStandards) {
        return service.add(qualityInspectionStandards) ? Result.success() : Result.failed();
    }
}