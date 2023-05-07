package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.PlatformDynamics;
import com.kanojo.service.yi.PlatformDynamicsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/pd")
public class PlatformDynamicsController {
    @Resource
    private PlatformDynamicsService platformDynamicsService;

    @GetMapping("/list")
    public Result list() {
        List<PlatformDynamics> list = platformDynamicsService.list();
        return list.size() != 0 ? Result.success(list) : Result.success("暂无数据");
    }
}
