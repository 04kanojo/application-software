package com.kanojo.mapper.si;

import com.kanojo.domain.si.JobAssembly;
import com.kanojo.domain.si.param.JobAssemblyParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JobAssemblyMapper {

    List<JobAssembly> list(JobAssemblyParam param);

    boolean update(JobAssembly jobAssembly);

    @Insert("insert into job_assembly (name, production_number,note) " +
            "values (#{name},#{productionNumber},#{note});")
    boolean add(JobAssembly jobAssembly);

    @Select("select * from job_assembly where id = #{id}")
    JobAssembly getById(Long id);

    @Delete("delete from job_assembly where id = #{id}")
    boolean delete(Long id);
}
