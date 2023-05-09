package com.kanojo.domain.si;

import lombok.Data;

import java.io.Serializable;

@Data
public class QualityInspectionStandards implements Serializable {
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
    private String name;

    /**
     *
     */
    private Integer modelNumber;

    /**
     *
     */
    private String specifications;

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
    private String checkoutType;

    /**
     *
     */
    private Integer standardValueUp;

    /**
     *
     */
    private Integer standardValueDown;

    /**
     *
     */
    private String note;

    private static final long serialVersionUID = 1L;
}