package com.kanojo.service.er.impl;

import com.kanojo.domain.er.DataAcquisition;
import com.kanojo.mapper.er.DataAcquisitionMapper;
import com.kanojo.service.er.DataAcquisitionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataAcquisitionServiceImpl implements DataAcquisitionService {
    @Resource
    private DataAcquisitionMapper mapper;

    @Override
    public List<DataAcquisition> list() {
        return mapper.list();
    }

    @Override
    public List<DataAcquisition> getByCo(String name) {
        return mapper.getByCo("%" + name + "%");
    }
}
