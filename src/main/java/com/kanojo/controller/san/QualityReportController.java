package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.domain.san.QualityReport;
import com.kanojo.domain.san.param.QualityReportParam;
import com.kanojo.service.san.QualityReportService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/quality-report")
public class QualityReportController {
    @Resource
    private QualityReportService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) QualityReportParam param) {
        List<QualityReport> list = service.list(param);
        return Result.success(list);
    }
}
