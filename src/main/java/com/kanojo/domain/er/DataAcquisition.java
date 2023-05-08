package com.kanojo.domain.er;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataAcquisition implements Serializable {

    private String name;

    private Integer number;

    private String unitCarbon;

    private String totalCarbon;

    private String unitPower;
    private String totalPower;

    private static final long serialVersionUID = 1L;
}