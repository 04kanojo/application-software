package com.kanojo.controller.si;

import com.kanojo.common.result.Result;
import com.kanojo.domain.si.QualityInspectionStandards;
import com.kanojo.service.si.QualityInspectionStandardsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
