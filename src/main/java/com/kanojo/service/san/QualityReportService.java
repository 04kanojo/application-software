package com.kanojo.service.san;

import com.kanojo.domain.san.QualityReport;
import com.kanojo.domain.san.param.QualityReportParam;

import java.util.List;

public interface QualityReportService {

    List<QualityReport> list(QualityReportParam param);
}
