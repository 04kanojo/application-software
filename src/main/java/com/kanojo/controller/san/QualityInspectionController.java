package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.domain.san.QualityInspection;
import com.kanojo.domain.san.param.QualityInspectParam;
import com.kanojo.service.san.QualityInspectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/quality-inspection")
public class QualityInspectionController {
    @Resource
    private QualityInspectionService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) QualityInspectParam param) {
        return Result.success(service.list(param));
    }

    @PostMapping("/update")
    public Result update(@RequestBody QualityInspection qualityInspection) {
        return service.update(qualityInspection) ? Result.success() : Result.failed();
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }

    @PostMapping("/add")
    public Result add(@RequestBody QualityInspection qualityInspection) {
        return service.add(qualityInspection) ? Result.success() : Result.failed();
    }

    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable Long id) {
        QualityInspection qualityInspection = service.getById(id);
        return Result.success(qualityInspection);
    }
}
