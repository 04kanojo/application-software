package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.MaterialFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MaterialFileMapper {

    @Select("select * from material_file where material_code = #{code}")
    List<MaterialFile> getByCode(Integer code);
}




