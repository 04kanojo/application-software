package com.kanojo.service.er;

import com.kanojo.domain.er.Complaint;

import java.util.List;

public interface ComplaintService {

    List<Complaint> list();

    boolean add(Complaint complaint);

    boolean update(Complaint complaint);

    Complaint getById(Long id);
}
