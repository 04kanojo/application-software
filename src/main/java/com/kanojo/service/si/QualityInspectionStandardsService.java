package com.kanojo.service.si;

import com.kanojo.domain.si.QualityInspectionStandards;

import java.util.List;

public interface QualityInspectionStandardsService {
    List<QualityInspectionStandards> list(QualityInspectionStandards qualityInspectionStandards);

    boolean update(QualityInspectionStandards qualityInspectionStandards);

    List<QualityInspectionStandards> getById(Long id);

    boolean delete(Long id);

    boolean add(QualityInspectionStandards qualityInspectionStandards);
}
