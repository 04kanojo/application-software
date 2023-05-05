package com.kanojo.service;

import com.kanojo.domain.JFactory;

import java.util.List;

public interface JFactoryService {
    List<JFactory> list();

    boolean delete(Long number);

    JFactory getById(Long number);
}
