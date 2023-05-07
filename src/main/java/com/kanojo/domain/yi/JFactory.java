package com.kanojo.domain.yi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JFactory implements Serializable {
    private Long number;

    private String project;

    private String moduleName;

    private String clineName;

    private String projectModelOf;

    private String projectSpecification;

    private String info;

    private static final long serialVersionUID = 1L;
}