package com.kanojo.service;


import com.kanojo.domain.ConditionParam;
import com.kanojo.domain.EnergyEfficiency;

import java.util.List;

public interface EnergyEfficiencyService {

    List<EnergyEfficiency> getAll();

    boolean update(EnergyEfficiency energyEfficiency);

    boolean delete(Long number);

    List<EnergyEfficiency> getByCondition(ConditionParam conditionParam);

    boolean add(EnergyEfficiency energyEfficiency);
}
