package com.kanojo.domain.er;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InfoManagement implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer code;

    /**
     *
     */
    private Integer modelNumber;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     *
     */
    private Integer batch;

    /**
     *
     */
    private String manufacturer;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private String note;

    private static final long serialVersionUID = 1L;
}