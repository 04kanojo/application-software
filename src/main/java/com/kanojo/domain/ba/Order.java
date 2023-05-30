package com.kanojo.domain.ba;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @TableName order
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer id;
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
    private BigDecimal money;
    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sunbmitDate;
    /**
     *
     */
    private String applicationPeople;
    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applicationDate;
    /**
     *
     */
    private Integer applicationStatus;
    /**
     *
     */
    private String checkoutPeople;
    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkoutDate;
    /**
     *
     */
    private Integer checkoutStatus;
    /**
     *
     */
    private String checkoutYijian;
}