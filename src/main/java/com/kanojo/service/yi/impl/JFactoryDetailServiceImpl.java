package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.JFactoryDetail;
import com.kanojo.mapper.yi.JFactoryDetailMapper;
import com.kanojo.service.yi.JFactoryDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JFactoryDetailServiceImpl implements JFactoryDetailService {
    @Resource
    private JFactoryDetailMapper mapper;

    @Override
    public boolean add(JFactoryDetail jFactoryDetail) {
        return mapper.add(jFactoryDetail) > 0;
    }

    @Override
    public boolean delete(Long number) {
        return mapper.delete(number) > 0;
    }
}
