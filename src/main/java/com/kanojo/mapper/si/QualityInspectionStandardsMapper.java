package com.kanojo.mapper.si;

import com.kanojo.domain.si.QualityInspectionStandards;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QualityInspectionStandardsMapper {


    List<QualityInspectionStandards> list(QualityInspectionStandards qualityInspectionStandards);

    boolean update(QualityInspectionStandards qualityInspectionStandards);

    @Select("select * from quality_inspection_standards")
    List<QualityInspectionStandards> getById(Long id);

    @Delete("delete from quality_inspection_standards where id = #{id}")
    boolean delete(Long id);

    @Insert("insert into quality_inspection_standards (name, checkout_type, standard_value_up, standard_value_down, note) " +
            "values (#{name}, #{checkoutType}, #{standardValueUp}, #{standardValueDown}, #{note});")
    boolean add(QualityInspectionStandards qualityInspectionStandards);
}
