package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.ProjectManagement;
import com.kanojo.domain.yi.param.PM_ConditionParam;
import com.kanojo.mapper.yi.ProjectManagementMapper;
import com.kanojo.service.yi.ProjectManagementService;
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
        param.setProjectName("%" + param.getProjectName() + "%");
        return projectManagementMapper.selectByCondition(param);
    }

    @Override
    public boolean add(ProjectManagement projectManagement) {
        return projectManagementMapper.add(projectManagement) > 0;
    }

    @Override
    public boolean update(ProjectManagement projectManagement) {
        return projectManagementMapper.update(projectManagement) > 0;
    }
}
