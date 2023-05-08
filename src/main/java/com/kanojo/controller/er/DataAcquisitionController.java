package com.kanojo.controller.er;

import com.kanojo.common.result.Result;
import com.kanojo.domain.er.DataAcquisition;
import com.kanojo.service.er.DataAcquisitionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/da")
public class DataAcquisitionController {

    @Resource
    private DataAcquisitionService service;

    @GetMapping("/list")
    public Result list() {
        List<DataAcquisition> list = service.list();
        return Result.success(list);
    }

    @GetMapping("/getByCo/{name}")
    public Result getByCondition(@PathVariable String name) {
        List<DataAcquisition> list = service.getByCo(name);
        return Result.success(list);
    }
}
