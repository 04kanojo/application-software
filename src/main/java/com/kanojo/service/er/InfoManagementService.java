package com.kanojo.service.er;

import com.kanojo.domain.er.InfoManagement;
import com.kanojo.domain.er.param.InfoManagementParam;

import java.util.List;

public interface InfoManagementService {

    List<InfoManagement> list();

    boolean update(InfoManagement infoManagement);

    boolean delete(Long id);

    List<InfoManagement> getByCo(InfoManagementParam param);

    boolean add(InfoManagement infoManagement);
}
