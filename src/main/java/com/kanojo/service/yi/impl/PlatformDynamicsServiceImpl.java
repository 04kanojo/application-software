package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.PlatformDynamics;
import com.kanojo.mapper.yi.PlatformDynamicsMapper;
import com.kanojo.service.yi.PlatformDynamicsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlatformDynamicsServiceImpl implements PlatformDynamicsService {
    @Resource
    private PlatformDynamicsMapper platformDynamicsMapper;

    @Override
    public List<PlatformDynamics> list() {
        return platformDynamicsMapper.list();
    }
}
