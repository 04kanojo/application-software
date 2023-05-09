package com.kanojo.mapper.si;

import com.kanojo.domain.si.ProductionSampling;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductionSamplingMapper {

    List<ProductionSampling> list(ProductionSampling productionSampling);

    boolean update(ProductionSampling productionSampling);

    @Select("select * from production_sampling where id = #{id}")
    ProductionSampling geyById(Long id);

    @Delete("delete from production_sampling where id = #{id}")
    boolean delete(Long id);

    @Insert("insert into production_sampling (homework_name,material_name,sampling_number,checkout_standard,checkout_value,checkout_result) " +
            "values (#{homeworkName},#{materialName},#{samplingNumber},#{checkoutStandard},#{checkoutValue},#{checkoutResult});")
    boolean add(ProductionSampling productionSampling);
}
