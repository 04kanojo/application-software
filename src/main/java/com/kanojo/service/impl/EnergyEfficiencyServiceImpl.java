package com.kanojo.service.impl;

import com.kanojo.domain.ConditionParam;
import com.kanojo.domain.EnergyEfficiency;
import com.kanojo.mapper.EnergyEfficiencyMapper;
import com.kanojo.service.EnergyEfficiencyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class EnergyEfficiencyServiceImpl implements EnergyEfficiencyService {

    @Resource
    private EnergyEfficiencyMapper energyEfficiencyMapper;

    @Override
    public List<EnergyEfficiency> getAll() {
        return energyEfficiencyMapper.selectAll();
    }

    @Override
    public boolean update(EnergyEfficiency energyEfficiency) {
        return energyEfficiencyMapper.update(energyEfficiency);
    }

    @Override
    public boolean delete(Long number) {
        return energyEfficiencyMapper.delete(number);
    }

    @Override
    public List<EnergyEfficiency> getByCondition(ConditionParam conditionParam) {
        return energyEfficiencyMapper.getByCondition(conditionParam);
    }

    @Override
    public boolean add(EnergyEfficiency energyEfficiency) {
        return energyEfficiencyMapper.add(energyEfficiency);
    }
}




