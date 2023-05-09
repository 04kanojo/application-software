package com.kanojo.service.si.impl;

import com.kanojo.domain.si.QualityInspectionStandards;
import com.kanojo.mapper.si.QualityInspectionStandardsMapper;
import com.kanojo.service.si.QualityInspectionStandardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QualityInspectionStandardsServiceImpl implements QualityInspectionStandardsService {
    @Resource
    private QualityInspectionStandardsMapper mapper;

    @Override
    public List<QualityInspectionStandards> list(QualityInspectionStandards qualityInspectionStandards) {
        qualityInspectionStandards.setName("%" + qualityInspectionStandards.getName() + "%");
        return mapper.list(qualityInspectionStandards);
    }

    @Override
    public boolean update(QualityInspectionStandards qualityInspectionStandards) {
        return mapper.update(qualityInspectionStandards);
    }

    @Override
    public List<QualityInspectionStandards> getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public boolean add(QualityInspectionStandards qualityInspectionStandards) {
        return mapper.add(qualityInspectionStandards);
    }
}
