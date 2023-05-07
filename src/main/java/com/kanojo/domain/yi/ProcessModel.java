package com.kanojo.domain.yi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessModel implements Serializable {
    private Long number;

    private String processName;

    private String product;

    private String model;

    private String specifications;
    private String unit;

    private String unitPower;

    private String note;

    private String info;
    private static final long serialVersionUID = 1L;
}