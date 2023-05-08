package com.kanojo.service.er;

import com.kanojo.domain.er.DataAcquisition;

import java.util.List;

public interface DataAcquisitionService {

    List<DataAcquisition> list();

    List<DataAcquisition> getByCo(String name);
}
