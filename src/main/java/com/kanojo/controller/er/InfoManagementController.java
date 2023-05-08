package com.kanojo.controller.er;

import com.kanojo.common.result.Result;
import com.kanojo.domain.er.InfoManagement;
import com.kanojo.domain.er.param.InfoManagementParam;
import com.kanojo.service.er.InfoManagementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoManagementController {

    @Resource
    private InfoManagementService service;

    @GetMapping("/list")
    public Result list() {
        List<InfoManagement> list = service.list();
        return Result.success(list);
    }

    @PostMapping("/update")
    public Result update(@RequestBody InfoManagement infoManagement) {
        return service.update(infoManagement) ? Result.success() : Result.failed();
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }

    @PostMapping("/getByCondition")
    public Result getByCondition(@RequestBody InfoManagementParam param) {
        List<InfoManagement> list = service.getByCo(param);
        return Result.success(list);
    }

    @PostMapping("/add")
    public Result add(@RequestBody InfoManagement infoManagement) {
        return service.add(infoManagement) ? Result.success() : Result.failed();
    }
}
