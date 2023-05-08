package com.kanojo.mapper.san;

import com.kanojo.domain.san.QualityInspection;
import com.kanojo.domain.san.param.QualityInspectParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QualityInspectionMapper {


    List<QualityInspection> list(QualityInspectParam param);

    boolean update(QualityInspection qualityInspection);

    @Delete("delete from quality_inspection where id = #{id}")
    boolean delete(Long id);

    @Insert("insert into quality_inspection (number,random_inspection_number,name,checkout_value, checkout_result, note) " +
            "values (#{number},#{randomInspectionNumber},#{name},#{checkoutValue},#{checkoutResult}, #{note});")
    boolean add(QualityInspection qualityInspection);

    @Select("select * from quality_inspection where id = #{id}")
    QualityInspection getById(Long id);
}
