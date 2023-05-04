package com.kanojo.mapper;

import com.kanojo.domain.ProjectManagement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectManagementMapper {

    @Select("select * from project_management")
    List<ProjectManagement> selectAll();
}
