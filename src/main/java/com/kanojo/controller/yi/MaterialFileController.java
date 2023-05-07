package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.MaterialFile;
import com.kanojo.service.yi.MaterialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/materialFile")
public class MaterialFileController {
    @Resource
    private MaterialService materialService;

    @GetMapping("/getByCode/{code}")
    public Result getByCode(@PathVariable Integer code) {
        List<MaterialFile> list = materialService.getByCode(code);
        return list.size() != 0 ? Result.success(list) : Result.success("暂无数据");
    }
}
