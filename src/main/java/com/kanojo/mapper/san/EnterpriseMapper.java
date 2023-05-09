package com.kanojo.mapper.san;

import com.kanojo.domain.san.Enterprise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EnterpriseMapper {


    @Select("select * from enterprise")
    List<Enterprise> list();
}
