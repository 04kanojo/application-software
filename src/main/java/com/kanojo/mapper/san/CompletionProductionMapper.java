package com.kanojo.mapper.san;

import com.kanojo.domain.san.CompletionProduction;
import com.kanojo.domain.san.param.CompletionProductConditionParam;
import com.kanojo.domain.san.param.CompletionProductParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CompletionProductionMapper {


    @Select("select * from  completion_production")
    List<CompletionProduction> list();

    boolean update(CompletionProductParam param);

    @Delete("delete from completion_production where id = #{id}")
    boolean delete(Long id);

    List<CompletionProduction> getByCo(CompletionProductConditionParam param);
}
