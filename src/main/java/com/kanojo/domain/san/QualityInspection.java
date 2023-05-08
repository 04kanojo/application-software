package com.kanojo.domain.san;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QualityInspection implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    private Integer number;
    /**
     *
     */
    private Integer woterId;
    /**
     *
     */
    private Integer orderId;
    /**
     *
     */
    private String name;
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
    private Integer requirementsNumber;
    /**
     *
     */
    private Integer pickUpNumber;
    /**
     *
     */
    private Integer randomInspectionNumber;
    /**
     *
     */
    private Integer checkoutProject;
    /**
     *
     */
    private Integer standardsStart;
    /**
     *
     */
    private Integer standardsEnd;
    /**
     *
     */
    private Integer checkoutValue;
    /**
     *
     */
    private String checkoutResult;
    /**
     *
     */
    private String checkoutPeople;
    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkoutTime;
    /**
     *
     */
    private String note;
}