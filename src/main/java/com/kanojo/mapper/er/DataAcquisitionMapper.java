package com.kanojo.mapper.er;

import com.kanojo.domain.er.DataAcquisition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataAcquisitionMapper {


    @Select("select * from data_acquisition")
    List<DataAcquisition> list();

    @Select("select * from data_acquisition where name like #{name}")
    List<DataAcquisition> getByCo(String name);
}
