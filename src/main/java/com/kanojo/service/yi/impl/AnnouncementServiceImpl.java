package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.Announcement;
import com.kanojo.mapper.yi.AnnouncementMapper;
import com.kanojo.service.yi.AnnouncementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Resource
    private AnnouncementMapper announcementMapper;

    @Override
    public List<Announcement> list() {
        return announcementMapper.list();
    }
}
