package com.kanojo.service.impl;

import com.kanojo.domain.ProjectManagement;
import com.kanojo.domain.param.PM_ConditionParam;
import com.kanojo.mapper.ProjectManagementMapper;
import com.kanojo.service.ProjectManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {

    @Resource
    private ProjectManagementMapper projectManagementMapper;

    @Override
    public List<ProjectManagement> getAll() {
        return projectManagementMapper.selectAll();
    }

    @Override
    public boolean delete(Long number) {
        return projectManagementMapper.delete(number) > 0;
    }

    @Override
    public List<ProjectManagement> getByCondition(PM_ConditionParam param) {
        return projectManagementMapper.selectByCondition(param);
    }

    @Override
    public boolean add(ProjectManagement projectManagement) {
        return projectManagementMapper.add(projectManagement) > 0;
    }
}
