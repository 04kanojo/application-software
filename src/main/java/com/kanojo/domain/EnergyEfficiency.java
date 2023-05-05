package com.kanojo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnergyEfficiency implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long number;
    private String name;
    private String address;
    private String voltage;
    private String power;
    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date reportTime;
    private String note;
}