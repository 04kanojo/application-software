package com.kanojo.service.si.impl;

import com.kanojo.domain.si.ProductionSampling;
import com.kanojo.mapper.si.ProductionSamplingMapper;
import com.kanojo.service.si.ProductionSamplingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductionSamplingServiceImpl implements ProductionSamplingService {
    @Resource
    private ProductionSamplingMapper mapper;

    @Override
    public List<ProductionSampling> list(ProductionSampling productionSampling) {
        productionSampling.setHomeworkName("%" + productionSampling.getHomeworkName() + "%");
        productionSampling.setMaterialName("%" + productionSampling.getMaterialName() + "%");
        productionSampling.setCheckoutPeople("%" + productionSampling.getCheckoutPeople() + "%");
        return mapper.list(productionSampling);
    }

    @Override
    public boolean update(ProductionSampling productionSampling) {
        return mapper.update(productionSampling);
    }

    @Override
    public ProductionSampling getById(Long id) {
        return mapper.geyById(id);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }
}
