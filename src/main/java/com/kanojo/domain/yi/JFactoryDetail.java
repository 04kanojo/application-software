package com.kanojo.domain.yi;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JFactoryDetail implements Serializable {

    private Long number;

    private String equipment;

    private String code;

    private String model;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date productionTime;

    private String productionBatch;

    private String manufacturer;

    private static final long serialVersionUID = 1L;
}