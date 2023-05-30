package com.kanojo.mapper.ba;

import com.kanojo.domain.ba.ProductionPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductionPlanMapper {

    List<ProductionPlan> getAll(ProductionPlan productionPlan);

    boolean update(ProductionPlan productionPlan);
}




