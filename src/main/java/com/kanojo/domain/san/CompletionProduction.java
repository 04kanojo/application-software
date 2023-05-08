package com.kanojo.domain.san;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CompletionProduction implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String orderNumber;

    /**
     *
     */
    private String productionPlan;

    /**
     *
     */
    private String productionOperations;

    /**
     *
     */
    private String product;

    /**
     *
     */
    private String modelNumber;

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
    private Date endTime;

    /**
     *
     */
    private Integer productionNumber;

    /**
     *
     */
    private String batch;

    /**
     *
     */
    private Integer status;

    private String note;

    private static final long serialVersionUID = 1L;
}