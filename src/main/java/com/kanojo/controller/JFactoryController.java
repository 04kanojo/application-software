package com.kanojo.controller;

import com.kanojo.common.result.Result;
import com.kanojo.domain.JFactory;
import com.kanojo.service.JFactoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/JFactory")
public class JFactoryController {
    @Resource
    private JFactoryService jFactoryService;

    @GetMapping("/list")
    public Result list() {
        List<JFactory> list = jFactoryService.list();
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.success("暂无数据");
    }

    @GetMapping("/delete/{number}")
    public Result delete(@PathVariable Long number) {
        boolean flag = jFactoryService.delete(number);
        return flag ? Result.success(null, "删除成功") : Result.failed("删除失败");
    }

    @GetMapping("/getById/{number}")
    public Result getById(@PathVariable Long number) {
        JFactory jFactory = jFactoryService.getById(number);
        return jFactory != null ? Result.success(jFactory) : Result.failed();
    }
}
