package com.kanojo.service.san.impl;

import com.kanojo.domain.san.CompletionProduction;
import com.kanojo.domain.san.param.CompletionProductConditionParam;
import com.kanojo.domain.san.param.CompletionProductParam;
import com.kanojo.mapper.san.CompletionProductionMapper;
import com.kanojo.service.san.CompletionProductionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CompletionProductionServiceImpl implements CompletionProductionService {
    @Resource
    private CompletionProductionMapper mapper;

    @Override
    public List<CompletionProduction> list() {
        return mapper.list();
    }

    @Override
    public boolean update(CompletionProductParam param) {
        return mapper.update(param);
    }

    @Override
    public boolean delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public List<CompletionProduction> getByCo(CompletionProductConditionParam param) {
        if (param != null && param.getProduct() != null) {
            param.setProduct("%" + param.getProduct() + "%");
        }
        return mapper.getByCo(param);
    }
}
