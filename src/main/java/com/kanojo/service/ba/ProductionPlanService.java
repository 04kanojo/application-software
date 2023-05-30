package com.kanojo.service.ba;

import com.kanojo.domain.ba.ProductionPlan;

import java.util.List;


public interface ProductionPlanService {

    List<ProductionPlan> getAll(ProductionPlan productionPlan);

    boolean update(ProductionPlan productionPlan);
}
