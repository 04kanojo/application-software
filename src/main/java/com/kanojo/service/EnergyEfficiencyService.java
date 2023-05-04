package com.kanojo.service;


import com.kanojo.domain.EnergyEfficiency;
import com.kanojo.domain.param.EE_ConditionParam;

import java.util.List;

public interface EnergyEfficiencyService {

    List<EnergyEfficiency> getAll();

    boolean update(EnergyEfficiency energyEfficiency);

    boolean delete(Long number);

    List<EnergyEfficiency> getByCondition(EE_ConditionParam EEConditionParam);

    boolean add(EnergyEfficiency energyEfficiency);
}
