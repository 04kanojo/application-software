package com.kanojo.service.si.impl;

import com.kanojo.domain.si.JobAssembly;
import com.kanojo.domain.si.param.JobAssemblyParam;
import com.kanojo.mapper.si.JobAssemblyMapper;
import com.kanojo.service.si.JobAssemblyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobAssemblyServiceImpl implements JobAssemblyService {

    @Resource
    private JobAssemblyMapper mapper;

    @Override
    public List<JobAssembly> list(JobAssemblyParam param) {
        if  (param != null && param.getName() != null) {
            param.setName("%" + param.getName() + "%");
        }
        return mapper.list(param);
    }

    @Override
    public boolean update(JobAssembly jobAssembly) {
        return mapper.update(jobAssembly);
    }

    @Override
    public boolean add(JobAssembly jobAssembly) {
        return mapper.add(jobAssembly);
    }

    @Override
    public JobAssembly getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }
}
