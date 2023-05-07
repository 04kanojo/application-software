package com.kanojo.service.yi;

import com.kanojo.common.param.PageParam;
import com.kanojo.domain.yi.ProcessModel;

import java.util.List;

public interface ProcessModelService {
    List<ProcessModel> list(PageParam param);

    boolean delete(Long number);

    boolean update(ProcessModel processModel);

    List<ProcessModel> getByCondition(String processName);

    boolean add(ProcessModel processModel);
}
