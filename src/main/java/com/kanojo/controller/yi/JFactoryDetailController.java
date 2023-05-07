package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.JFactoryDetail;
import com.kanojo.service.yi.JFactoryDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/JFactoryDetail")
public class JFactoryDetailController {
    @Resource
    private JFactoryDetailService jFactoryDetailService;

    @PostMapping("/add")
    public Result add(@RequestBody JFactoryDetail jFactoryDetail) {
        return jFactoryDetailService.add(jFactoryDetail) ? Result.success() : Result.failed("添加失败");
    }

    @GetMapping("/delete/{number}")
    public Result delete(@PathVariable Long number) {
        return jFactoryDetailService.delete(number) ? Result.success() : Result.failed();
    }
}
