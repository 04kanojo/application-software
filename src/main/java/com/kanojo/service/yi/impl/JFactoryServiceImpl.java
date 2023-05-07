package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.JFactory;
import com.kanojo.mapper.yi.JFactoryMapper;
import com.kanojo.service.yi.JFactoryService;
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

    @Override
    public List<JFactory> getByCondition(String clineName) {
        return factoryMapper.getByCondition("%" + clineName + "%");
    }

    @Override
    public boolean add(JFactory jFactory) {
        return factoryMapper.add(jFactory);
    }
}
