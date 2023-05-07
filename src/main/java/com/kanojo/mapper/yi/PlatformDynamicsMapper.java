package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.PlatformDynamics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlatformDynamicsMapper {

    @Select("select * from platform_dynamics")
    List<PlatformDynamics> list();
}




