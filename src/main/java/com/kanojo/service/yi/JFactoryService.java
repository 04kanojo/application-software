package com.kanojo.service.yi;

import com.kanojo.domain.yi.JFactory;

import java.util.List;

public interface JFactoryService {
    List<JFactory> list();

    boolean delete(Long number);

    JFactory getById(Long number);

    List<JFactory> getByCondition(String clineName);

    boolean add(JFactory jFactory);
}
