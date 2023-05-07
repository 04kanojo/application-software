package com.kanojo.mapper.yi;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.yi.ProcessModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProcessModelMapper {

    @Select("select * from process_model limit #{cur},#{size}")
    List<ProcessModel> list(PageParam param);

    @Delete("delete from process_model where number = #{number}")
    boolean delete(Long number);

    boolean update(ProcessModel processModel);

    @Select("select * from process_model where process_name like #{s}")
    List<ProcessModel> getByCondition(String s);

    @Insert("insert into process_model (process_name, product, unit_power, note, info) " +
            "values (#{processName}, #{product}, #{unitPower}, #{note}, #{info});")
    boolean add(ProcessModel processModel);
}




