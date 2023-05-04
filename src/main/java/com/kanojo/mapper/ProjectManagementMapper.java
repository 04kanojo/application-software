package com.kanojo.mapper;

import com.kanojo.domain.ProjectManagement;
import com.kanojo.domain.param.PM_ConditionParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectManagementMapper {

    @Select("select * from project_management")
    List<ProjectManagement> selectAll();

    @Delete("delete from project_management where number = #{number}")
    Integer delete(Long number);

    List<ProjectManagement> selectByCondition(PM_ConditionParam param);
}