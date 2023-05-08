package com.kanojo.domain.san;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductInspection implements Serializable {
    private Long id;

    private Integer number;

    private Integer waterNumber;

    private Integer planNumber;

    private Integer orderNumber;

    private String homewordName;

    private String productionLineName;

    private String batch;

    private String productName;

    private Date createTime;

    private String checkout;

    private Integer productionNumber;

    private Integer randomInspectionNumber;

    private Integer verificationValue;

    private Integer thresholdValueUp;

    private Integer thresholdValueDown;

    private String checkoutResult;

    private Date checkoutTime;

    private String note;

    private static final long serialVersionUID = 1L;

    private String checkoutPeople;
}