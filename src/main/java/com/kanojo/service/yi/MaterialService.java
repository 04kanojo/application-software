package com.kanojo.service.yi;

import com.kanojo.domain.yi.MaterialFile;

import java.util.List;

public interface MaterialService {
    List<MaterialFile> getByCode(Integer code);
}
