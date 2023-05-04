package com.kanojo.controller;

import com.kanojo.common.result.Result;
import com.kanojo.domain.ProjectManagement;
import com.kanojo.domain.param.PM_ConditionParam;
import com.kanojo.service.ProjectManagementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/project_management")
public class ProjectManagementController {
    @Resource
    private ProjectManagementService projectManagementService;

    @GetMapping("/getAll")
    public Result getAll() {
        List<ProjectManagement> list = projectManagementService.getAll();
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.success(null, "暂无数据");
    }

    @DeleteMapping("/{number}")
    public Result delete(@PathVariable Long number) {
        boolean flag = projectManagementService.delete(number);
        return flag ? Result.success(null, "删除成功") : Result.failed("删除失败");
    }

    @PostMapping("/getByCondition")
    public Result getByCondition(@RequestBody PM_ConditionParam param) {
        List<ProjectManagement> list = projectManagementService.getByCondition(param);
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.success(null, "暂无数据");
    }
}
