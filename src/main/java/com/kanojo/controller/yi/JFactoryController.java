package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.JFactory;
import com.kanojo.service.yi.JFactoryService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getByCondition/{cline_name}")
    public Result getByCondition(@PathVariable String cline_name) {
        List<JFactory> list = jFactoryService.getByCondition(cline_name);
        return list.size() != 0 ? Result.success(list) : Result.failed();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JFactory jFactory) {
        return jFactoryService.add(jFactory) ? Result.success() : Result.failed();
    }
}
