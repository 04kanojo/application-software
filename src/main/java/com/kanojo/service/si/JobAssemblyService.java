package com.kanojo.service.si;

import com.kanojo.domain.si.JobAssembly;
import com.kanojo.domain.si.param.JobAssemblyParam;

import java.util.List;

public interface JobAssemblyService {

    List<JobAssembly> list(JobAssemblyParam param);

    boolean update(JobAssembly jobAssembly);

    boolean add(JobAssembly jobAssembly);

    JobAssembly getById(Long id);

    boolean delete(Long id);
}
