package com.kanojo.service.ba.impl;

import com.kanojo.domain.ba.ProductionPlan;
import com.kanojo.mapper.ba.ProductionPlanMapper;
import com.kanojo.service.ba.ProductionPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ProductionPlanServiceImpl implements ProductionPlanService {
    @Resource
    private ProductionPlanMapper mapper;

    @Override
    public List<ProductionPlan> getAll(ProductionPlan productionPlan) {
        return mapper.getAll(productionPlan);
    }

    @Override
    public boolean update(ProductionPlan productionPlan) {
        return mapper.update(productionPlan);
    }
}




