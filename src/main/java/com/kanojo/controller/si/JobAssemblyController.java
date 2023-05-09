package com.kanojo.controller.si;

import com.kanojo.common.result.Result;
import com.kanojo.domain.si.JobAssembly;
import com.kanojo.domain.si.param.JobAssemblyParam;
import com.kanojo.service.si.JobAssemblyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/job-ass")
public class JobAssemblyController {
    @Resource
    private JobAssemblyService service;

    @PostMapping("/update")
    public Result update(@RequestBody JobAssembly jobAssembly) {
        return service.update(jobAssembly) ? Result.success() : Result.failed();
    }

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) JobAssemblyParam param) {
        return Result.success(service.list(param));
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAssembly jobAssembly) {
        return service.add(jobAssembly) ? Result.success() : Result.failed();
    }

    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable Long id) {
        return Result.success(service.getById(id));
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }
}
