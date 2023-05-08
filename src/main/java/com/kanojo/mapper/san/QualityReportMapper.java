package com.kanojo.mapper.san;

import com.kanojo.domain.san.QualityReport;
import com.kanojo.domain.san.param.QualityReportParam;

import java.util.List;

public interface QualityReportMapper {


    List<QualityReport> list(QualityReportParam param);
}
