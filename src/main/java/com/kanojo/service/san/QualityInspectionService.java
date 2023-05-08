package com.kanojo.service.san;

import com.kanojo.domain.san.QualityInspection;
import com.kanojo.domain.san.param.QualityInspectParam;

import java.util.List;

public interface QualityInspectionService {

    List<QualityInspection> list(QualityInspectParam param);

    boolean update(QualityInspection qualityInspection);

    boolean delete(Long id);

    boolean add(QualityInspection qualityInspection);

    QualityInspection getById(Long id);
}
