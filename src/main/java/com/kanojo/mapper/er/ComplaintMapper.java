package com.kanojo.mapper.er;

import com.kanojo.domain.er.Complaint;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComplaintMapper {


    @Select("select * from complaint")
    List<Complaint> list();

    @Insert("insert into complaint (icon, title, create_time, status, info, file, result, people, phone) " +
            "values (#{icon}, #{title},#{createTime}, #{status}, #{info},#{file}, #{result}, #{people},#{phone});")
    boolean add(Complaint complaint);

    boolean update(Complaint complaint);

    @Select("select * from complaint where id = #{id}")
    Complaint getById(Long id);
}
