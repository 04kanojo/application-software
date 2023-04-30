package com.kanojo.controller;

import com.kanojo.common.result.Result;
import com.kanojo.domain.ConditionParam;
import com.kanojo.domain.EnergyEfficiency;
import com.kanojo.service.EnergyEfficiencyService;
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
        return flag ? Result.success(list) : Result.failed();
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
    public Result getByCondition(@RequestBody ConditionParam conditionParam) {
        List<EnergyEfficiency> list = energyEfficiencyService.getByCondition(conditionParam);
        boolean flag = list.size() != 0;
        return flag ? Result.success(list) : Result.failed();
    }

    @PostMapping("/add")
    public Result add(@RequestBody EnergyEfficiency energyEfficiency) {
        boolean flag = energyEfficiencyService.add(energyEfficiency);
        return flag ? Result.success() : Result.failed();
    }
}
