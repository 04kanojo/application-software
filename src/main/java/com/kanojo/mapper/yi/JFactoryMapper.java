package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.JFactory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JFactoryMapper {

    @Select("select * from j_factory")
    List<JFactory> list();

    @Delete("delete from j_factory where number = #{number}")
    boolean delete(Long number);

    @Select("select * from j_factory where number = #{number}")
    JFactory getById(Long number);

    @Select("select * from j_factory where cline_name like #{s}")
    List<JFactory> getByCondition(String s);

    @Insert("insert into j_factory (project, cline_name, info) " +
            "values (#{project}, #{clineName}, #{info});")
    boolean add(JFactory jFactory);
}




