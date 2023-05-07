package com.kanojo.mapper.yi;

import com.kanojo.domain.yi.Announcement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnnouncementMapper {
    @Select("select * from announcement")
    List<Announcement> list();
}
