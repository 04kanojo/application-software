package com.kanojo.mapper.san;

import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductInspectionMapper {


    List<ProductInspection> list(ProductInspectionParam param);

    boolean update(ProductInspection productInspection);

    @Select("select * from product_inspection where id = #{id}")
    ProductInspection getById(Long id);

    @Delete("delete from product_inspection where id = #{id}")
    boolean delete(Long id);

    @Insert("insert into product_inspection (order_number, random_inspection_number, checkout_result, note, checkout_standard,verification_value) " +
            "values (#{orderNumber}, #{randomInspectionNumber}, #{checkoutResult}, #{note}, #{checkoutStandard},#{verificationValue})")
    boolean add(ProductInspection productInspection);
}
