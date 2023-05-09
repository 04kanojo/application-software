package com.kanojo.service.si;

import com.kanojo.domain.si.ProductionSampling;

import java.util.List;

public interface ProductionSamplingService {

    List<ProductionSampling> list(ProductionSampling productionSampling);

    boolean update(ProductionSampling productionSampling);

    ProductionSampling getById(Long id);

    boolean delete(Long id);
}
