package com.kanojo.mapper.san;

import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductInspectionMapper {


    List<ProductInspection> list(ProductInspectionParam param);
}
