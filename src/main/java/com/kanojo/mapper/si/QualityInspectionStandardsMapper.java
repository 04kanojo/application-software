package com.kanojo.mapper.si;

import com.kanojo.domain.si.QualityInspectionStandards;

import java.util.List;

public interface QualityInspectionStandardsMapper {


    List<QualityInspectionStandards> list(QualityInspectionStandards qualityInspectionStandards);

    boolean update(QualityInspectionStandards qualityInspectionStandards);
}
