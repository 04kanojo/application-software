package com.kanojo.service.san;

import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;

import java.util.List;

public interface ProductInspectionService {

    List<ProductInspection> list(ProductInspectionParam param);

    boolean update(ProductInspection productInspection);
}
