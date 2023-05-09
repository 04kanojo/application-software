package com.kanojo.domain.si;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductionSampling implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Integer number;

    /**
     *
     */
    private Integer waterNumber;

    /**
     *
     */
    private Integer planNumber;

    /**
     *
     */
    private String homeworkName;

    /**
     *
     */
    private String materialName;

    /**
     *
     */
    private String specification;

    /**
     *
     */
    private Integer modelNumber;

    /**
     *
     */
    private String unit;

    /**
     *
     */
    private String checkout;

    /**
     *
     */
    private Integer productionNumber;

    /**
     *
     */
    private Integer samplingNumber;

    /**
     *
     */
    private String checkoutValue;

    /**
     *
     */
    private Integer thresholdValueUp;

    /**
     *
     */
    private Integer thresholdValueDown;

    /**
     *
     */
    private String checkoutPeople;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkoutTime;

    /**
     *
     */
    private String note;

    private String checkoutResult;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    private static final long serialVersionUID = 1L;
}