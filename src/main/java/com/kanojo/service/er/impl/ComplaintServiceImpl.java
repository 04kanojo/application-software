package com.kanojo.service.er.impl;

import com.kanojo.domain.er.Complaint;
import com.kanojo.mapper.er.ComplaintMapper;
import com.kanojo.service.er.ComplaintService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Resource
    private ComplaintMapper mapper;

    @Override
    public List<Complaint> list() {
        return mapper.list();
    }

    @Override
    public boolean add(Complaint complaint) {
        return mapper.add(complaint);
    }

    @Override
    public boolean update(Complaint complaint) {
        return mapper.update(complaint);
    }

    @Override
    public Complaint getById(Long id) {
        return mapper.getById(id);
    }
}
