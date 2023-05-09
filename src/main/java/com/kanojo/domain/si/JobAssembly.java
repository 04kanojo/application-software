package com.kanojo.domain.si;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName job_assembly
 */
@Data
public class JobAssembly implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String productionPlan;

    /**
     *
     */
    private String planSchedulingProduction;

    /**
     *
     */
    private String product;

    /**
     *
     */
    private Integer modelNumber;

    /**
     *
     */
    private String specification;

    /**
     *
     */
    private String unit;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    private String note;

    private String productionInfo;

    private Integer productionNumber;
}