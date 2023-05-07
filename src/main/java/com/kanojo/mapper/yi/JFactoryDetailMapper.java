package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.JFactoryDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JFactoryDetailMapper {

    @Insert("insert into j_factory_detail (number, equipment, code, model, production_batch, manufacturer,production_time) " +
            "values (#{number}, #{equipment}, #{code}, #{model}, #{productionBatch}, #{manufacturer},#{productionTime});")
    int add(JFactoryDetail jFactoryDetail);

    @Delete("delete from j_factory_detail where number = #{number}")
    int delete(Long number);
}




