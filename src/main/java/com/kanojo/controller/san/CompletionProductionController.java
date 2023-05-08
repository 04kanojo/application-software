package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.domain.san.CompletionProduction;
import com.kanojo.domain.san.param.CompletionProductConditionParam;
import com.kanojo.domain.san.param.CompletionProductParam;
import com.kanojo.service.san.CompletionProductionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/completion-production")
public class CompletionProductionController {
    @Resource
    private CompletionProductionService service;

    @GetMapping("/list")
    public Result list() {
        return Result.success(service.list());
    }

    @PostMapping("/update")
    public Result update(@RequestBody CompletionProductParam param) {
        return service.update(param) ? Result.success() : Result.failed();
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }

    @PostMapping("/getByCondition")
    public Result getByCondition(@RequestBody(required = false) CompletionProductConditionParam param) {
        List<CompletionProduction> list = service.getByCo(param);
        return Result.success(list);
    }
}
