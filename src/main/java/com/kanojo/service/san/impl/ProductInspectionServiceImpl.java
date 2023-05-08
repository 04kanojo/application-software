package com.kanojo.service.san.impl;

import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;
import com.kanojo.mapper.san.ProductInspectionMapper;
import com.kanojo.service.san.ProductInspectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ProductInspectionServiceImpl implements ProductInspectionService {
    @Resource
    private ProductInspectionMapper mapper;

    @Override
    public List<ProductInspection> list(ProductInspectionParam param) {
        return mapper.list(param);
    }

    @Override
    public boolean update(ProductInspection productInspection) {
        return mapper.update(productInspection);
    }
}
