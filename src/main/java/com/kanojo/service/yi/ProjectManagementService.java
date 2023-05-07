package com.kanojo.service.yi;

import com.kanojo.domain.yi.ProjectManagement;
import com.kanojo.domain.yi.param.PM_ConditionParam;

import java.util.List;

public interface ProjectManagementService {

    List<ProjectManagement> getAll();

    boolean delete(Long number);

    List<ProjectManagement> getByCondition(PM_ConditionParam param);

    boolean add(ProjectManagement projectManagement);

    boolean update(ProjectManagement projectManagement);
}