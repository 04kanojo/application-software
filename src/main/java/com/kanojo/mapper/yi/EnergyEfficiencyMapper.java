package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.EnergyEfficiency;
import com.kanojo.domain.yi.param.EE_ConditionParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EnergyEfficiencyMapper {

    @Select("select * from energy_efficiency")
    List<EnergyEfficiency> selectAll();

    Integer update(EnergyEfficiency energyEfficiency);

    @Delete("delete from energy_efficiency where number = #{number}")
    Integer delete(Long number);

    List<EnergyEfficiency> getByCondition(EE_ConditionParam EEConditionParam);

    @Insert("insert into energy_efficiency (name, address, voltage, power, note) " +
            "values (#{name},#{address},#{voltage},#{power},#{note})")
    boolean add(EnergyEfficiency energyEfficiency);
}




