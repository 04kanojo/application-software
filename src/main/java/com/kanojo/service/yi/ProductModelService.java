package com.kanojo.service.yi;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.er.ProductModel;

import java.util.List;


public interface ProductModelService {

    List<ProductModel> list(PageParam param);

    boolean update(ProductModel productModel);
}
