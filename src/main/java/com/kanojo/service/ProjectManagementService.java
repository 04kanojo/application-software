package com.kanojo.service;

import com.kanojo.domain.ProjectManagement;
import com.kanojo.domain.param.PM_ConditionParam;

import java.util.List;

public interface ProjectManagementService {

    List<ProjectManagement> getAll();

    boolean delete(Long number);

    List<ProjectManagement> getByCondition(PM_ConditionParam param);

    boolean add(ProjectManagement projectManagement);

    boolean update(ProjectManagement projectManagement);
}