package com.kanojo.service.yi.impl;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.yi.ProcessModel;
import com.kanojo.mapper.yi.ProcessModelMapper;
import com.kanojo.service.yi.ProcessModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProcessModelServiceImpl implements ProcessModelService {
    @Resource
    private ProcessModelMapper processModelMapper;

    @Override
    public List<ProcessModel> list(PageParam param) {
        return processModelMapper.list(param);
    }

    @Override
    public boolean delete(Long number) {
        return processModelMapper.delete(number);
    }

    @Override
    public boolean update(ProcessModel processModel) {
        return processModelMapper.update(processModel);
    }

    @Override
    public List<ProcessModel> getByCondition(String processName) {
        return processModelMapper.getByCondition("%" + processName + "%");
    }

    @Override
    public boolean add(ProcessModel processModel) {
        return processModelMapper.add(processModel);
    }
}
