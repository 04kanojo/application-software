package com.kanojo.service.san.impl;

import com.kanojo.domain.san.QualityInspection;
import com.kanojo.domain.san.param.QualityInspectParam;
import com.kanojo.mapper.san.QualityInspectionMapper;
import com.kanojo.service.san.QualityInspectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QualityInspectionServiceImpl implements QualityInspectionService {

    @Resource
    private QualityInspectionMapper mapper;

    @Override
    public List<QualityInspection> list(QualityInspectParam param) {
        if (param != null && param.getName() != null) {
            param.setName("%" + param.getName() + "%");
        }
        return mapper.list(param);
    }

    @Override
    public boolean update(QualityInspection qualityInspection) {
        return mapper.update(qualityInspection);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public boolean add(QualityInspection qualityInspection) {
        return mapper.add(qualityInspection);
    }

    @Override
    public QualityInspection getById(Long id) {
        return mapper.getById(id);
    }
}
