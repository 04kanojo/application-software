package com.kanojo.mapper;

import com.kanojo.domain.JFactory;
import org.apache.ibatis.annotations.Delete;
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
}




