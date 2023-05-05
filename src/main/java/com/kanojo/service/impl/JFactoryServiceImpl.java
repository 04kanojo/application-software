package com.kanojo.service.impl;

import com.kanojo.domain.JFactory;
import com.kanojo.mapper.JFactoryMapper;
import com.kanojo.service.JFactoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JFactoryServiceImpl implements JFactoryService {
    @Resource
    private JFactoryMapper factoryMapper;

    @Override
    public List<JFactory> list() {
        return factoryMapper.list();
    }

    @Override
    public boolean delete(Long number) {
        return factoryMapper.delete(number);
    }

    @Override
    public JFactory getById(Long number) {
        return factoryMapper.getById(number);
    }
}
