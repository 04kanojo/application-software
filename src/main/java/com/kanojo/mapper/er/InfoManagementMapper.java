package com.kanojo.mapper.er;

import com.kanojo.domain.er.InfoManagement;
import com.kanojo.domain.er.param.InfoManagementParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfoManagementMapper {
    @Select("select * from info_management")
    List<InfoManagement> list();

    boolean update(InfoManagement infoManagement);

    @Delete("delete from info_management where id = #{id}")
    boolean delete(Long id);

    List<InfoManagement> getByCo(InfoManagementParam param);

    @Insert("insert into info_management (name, code, model_number, create_time, batch, manufacturer, status, note) " +
            "values (#{name}, #{code}, #{modelNumber}, #{createTime}, #{batch}, #{manufacturer}, #{status}, #{note});")
    boolean insert(InfoManagement infoManagement);
}
