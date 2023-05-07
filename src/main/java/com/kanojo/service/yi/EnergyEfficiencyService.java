package com.kanojo.service.yi;


import com.kanojo.domain.yi.EnergyEfficiency;
import com.kanojo.domain.yi.param.EE_ConditionParam;

import java.util.List;

public interface EnergyEfficiencyService {

    List<EnergyEfficiency> getAll();

    boolean update(EnergyEfficiency energyEfficiency);

    boolean delete(Long number);

    List<EnergyEfficiency> getByCondition(EE_ConditionParam EEConditionParam);

    boolean add(EnergyEfficiency energyEfficiency);
}
