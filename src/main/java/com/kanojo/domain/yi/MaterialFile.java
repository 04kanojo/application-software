package com.kanojo.domain.yi;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MaterialFile implements Serializable {
    private Long number;

    private Integer materialCode;

    private String materialName;

    private String model;

    private String specifications;

    private String unit;

    private BigDecimal price;

    private String type;

    private String node;

    private static final long serialVersionUID = 1L;
}