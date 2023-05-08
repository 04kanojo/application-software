package com.kanojo.domain.san;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String checkout;

    private Integer productionNumber;

    private Integer randomInspectionNumber;

    private Integer verificationValue;

    private Integer thresholdValueUp;

    private Integer thresholdValueDown;

    private String checkoutResult;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkoutTime;

    private String note;

    private static final long serialVersionUID = 1L;

    private String checkoutPeople;

    private String checkoutStandard;
}