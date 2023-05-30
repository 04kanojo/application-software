package com.kanojo.domain.ba;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName production_plan
 */
@Data
public class ProductionPlan implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer planId;

    /**
     *
     */
    private String product;

    /**
     *
     */
    private String name;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date submitDate;

    /**
     *
     */
    private String sqPeople;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sqDate;

    /**
     *
     */
    private Integer sqStatus;

    /**
     *
     */
    private String shPeople;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date shDate;

    /**
     *
     */
    private Integer shStatus;

    /**
     *
     */
    private String shYijian;

    private static final long serialVersionUID = 1L;
}