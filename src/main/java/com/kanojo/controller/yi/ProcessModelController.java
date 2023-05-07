package com.kanojo.controller.yi;

import com.kanojo.common.param.PageParam;
import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.ProcessModel;
import com.kanojo.service.yi.ProcessModelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/processModel")
public class ProcessModelController {
    @Resource
    private ProcessModelService processModelService;

    @PostMapping("/list")
    public Result list(@RequestBody PageParam param) {
        List<ProcessModel> list = processModelService.list(param);
        return list.size() != 0 ? Result.success(list) : Result.success("暂无数据");
    }

    @GetMapping("/delete/{number}")
    public Result delete(@PathVariable Long number) {
        return processModelService.delete(number) ? Result.success() : Result.failed();
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProcessModel processModel) {
        return processModelService.update(processModel) ? Result.success() : Result.failed();
    }

    @GetMapping("/getByCondition/{processName}")
    public Result getByCondition(@PathVariable String processName) {
        List<ProcessModel> list = processModelService.getByCondition(processName);
        return list.size() != 0 ? Result.success(list) : Result.success("暂无数据");
    }

    @PostMapping("/add")
    public Result add(@RequestBody ProcessModel processModel) {
        return processModelService.add(processModel) ? Result.success() : Result.failed();
    }
}
