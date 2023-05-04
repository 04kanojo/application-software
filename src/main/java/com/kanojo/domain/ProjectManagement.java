package com.kanojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectManagement implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long number;
    private String projectName;
    private String responsiblePerson;
    private Date startTime;
    private Date endTime;
    private Integer status;
    private String projectIntroduction;
}