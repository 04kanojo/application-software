package com.kanojo.controller;

import com.kanojo.common.result.Result;
import com.kanojo.domain.ProjectManagement;
import com.kanojo.domain.param.PM_ConditionParam;
import com.kanojo.service.ProjectManagementService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

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

    @PostMapping("/upload")
    public Result upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        //获取文件名字(有后缀名)
        String fileSuffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        String fileName =
                UUID.randomUUID()
                        .toString()
                        .replace("-", "")
                        .toLowerCase(Locale.ROOT) +
                        fileSuffix;
        multipartFile.transferTo(new File("D:\\Temp/" + fileName));
        //返回的映射路径
        String path = "/picture/" + fileName;
        return Result.success(path);
    }

    @PostMapping("/add")
    public Result add(@RequestBody ProjectManagement projectManagement) {
        boolean flag = projectManagementService.add(projectManagement);
        return flag ? Result.success() : Result.failed();
    }
}
