package com.kanojo.service.san;

import com.kanojo.domain.san.CompletionProduction;
import com.kanojo.domain.san.param.CompletionProductConditionParam;
import com.kanojo.domain.san.param.CompletionProductParam;

import java.util.List;

public interface CompletionProductionService {
    List<CompletionProduction> list();

    boolean update(CompletionProductParam param);

    boolean delete(Long id);

    List<CompletionProduction> getByCo(CompletionProductConditionParam param);
}
