package com.kanojo.service.san.impl;

import com.kanojo.domain.san.Enterprise;
import com.kanojo.mapper.san.EnterpriseMapper;
import com.kanojo.service.san.EnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Resource
    private EnterpriseMapper mapper;

    @Override
    public List<Enterprise> list() {
        return mapper.list();
    }
}
