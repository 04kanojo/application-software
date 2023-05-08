package com.kanojo.service.san.impl;

import com.kanojo.domain.san.QualityReport;
import com.kanojo.domain.san.param.QualityReportParam;
import com.kanojo.mapper.san.QualityReportMapper;
import com.kanojo.service.san.QualityReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class QualityReportServiceImpl implements QualityReportService {

    @Resource
    private QualityReportMapper mapper;

    @Override
    public List<QualityReport> list(QualityReportParam param) {
        return mapper.list(param);
    }
}
