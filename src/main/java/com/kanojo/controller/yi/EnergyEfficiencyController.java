package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.EnergyEfficiency;
import com.kanojo.domain.yi.param.EE_ConditionParam;
import com.kanojo.service.yi.EnergyEfficiencyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/energyEfficiency")
public class EnergyEfficiencyController {

    @Resource
    private EnergyEfficiencyService energyEfficiencyService;

    @GetMapping("/getAll")
    public Result getAll() {
        List<EnergyEfficiency> list = energyEfficiencyService.getAll();
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.success(null, "暂无数据");
    }

    @PutMapping("/update")
    public Result update(@RequestBody EnergyEfficiency energyEfficiency) {
        boolean flag = energyEfficiencyService.update(energyEfficiency);
        return flag ? Result.success() : Result.failed();
    }

    @DeleteMapping("/{number}")
    public Result delete(@PathVariable Long number) {
        boolean flag = energyEfficiencyService.delete(number);
        return flag ? Result.success() : Result.failed();
    }

    @PostMapping("/getByCondition")
    public Result getByCondition(@RequestBody EE_ConditionParam EEConditionParam) {
        List<EnergyEfficiency> list = energyEfficiencyService.getByCondition(EEConditionParam);
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.success(null, "暂无数据");
    }

    @PostMapping("/add")
    public Result add(@RequestBody EnergyEfficiency energyEfficiency) {
        boolean flag = energyEfficiencyService.add(energyEfficiency);
        return flag ? Result.success() : Result.failed();
    }
}
