package com.kanojo.service.yi.impl;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.er.ProductModel;
import com.kanojo.mapper.er.ProductModelMapper;
import com.kanojo.service.yi.ProductModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductModelServiceImpl implements ProductModelService {

    @Resource
    private ProductModelMapper mapper;

    @Override
    public List<ProductModel> list(PageParam param) {
        return mapper.list(param);
    }

    @Override
    public boolean update(ProductModel productModel) {
        return mapper.update(productModel);
    }
}
