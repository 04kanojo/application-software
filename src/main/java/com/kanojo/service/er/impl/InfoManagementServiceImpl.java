package com.kanojo.service.er.impl;

import com.kanojo.domain.er.InfoManagement;
import com.kanojo.domain.er.param.InfoManagementParam;
import com.kanojo.mapper.er.InfoManagementMapper;
import com.kanojo.service.er.InfoManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoManagementServiceImpl implements InfoManagementService {

    @Resource
    private InfoManagementMapper mapper;

    @Override
    public List<InfoManagement> list() {
        return mapper.list();
    }

    @Override
    public boolean update(InfoManagement infoManagement) {
        return mapper.update(infoManagement);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public List<InfoManagement> getByCo(InfoManagementParam param) {
        return mapper.getByCo(param);
    }

    @Override
    public boolean add(InfoManagement infoManagement) {
        return mapper.insert(infoManagement);
    }
}
