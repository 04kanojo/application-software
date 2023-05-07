package com.kanojo.domain.yi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialFile implements Serializable {

    private Long number;

    private String materialCode;

    private String materialName;

    private String model;

    private String specifications;

    private String unit;

    private BigDecimal price;

    private String type;

    private String node;

    private static final long serialVersionUID = 1L;
}