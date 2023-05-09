package com.kanojo.domain.si;

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
    private Date checkoutTime;

    /**
     *
     */
    private String note;

    private static final long serialVersionUID = 1L;
}