package com.kanojo.mapper.er;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.er.ProductModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductModelMapper {

    @Select("select * from product_model limit #{cur},#{size}")
    List<ProductModel> list(PageParam param);

    boolean update(ProductModel productModel);
}
