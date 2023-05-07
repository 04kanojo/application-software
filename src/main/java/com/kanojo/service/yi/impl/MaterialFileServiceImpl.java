package com.kanojo.service.yi.impl;

import com.kanojo.domain.yi.MaterialFile;
import com.kanojo.mapper.yi.MaterialFileMapper;
import com.kanojo.service.yi.MaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MaterialFileServiceImpl implements MaterialService {
    @Resource
    private MaterialFileMapper mapper;

    @Override
    public List<MaterialFile> getByCode(Integer code) {
        return mapper.getByCode(code);
    }
}
