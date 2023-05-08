package com.kanojo.domain.san;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QualityReport implements Serializable {
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
    private Integer checkoutNumber;

    /**
     *
     */
    private Integer planNumber;

    /**
     *
     */
    private Integer orderNumber;

    /**
     *
     */
    private String homeworkName;

    /**
     *
     */
    private String lineName;

    /**
     *
     */
    private String batch;

    /**
     *
     */
    private String productName;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;

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
    private Integer randomInspectionNumber;

    /**
     *
     */
    private String checkoutPeople;

    /**
     *
     */
    private Integer qualifiedNumber;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkoutTime;

    private static final long serialVersionUID = 1L;
}