package com.kanojo.domain.er;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Complaint implements Serializable {
    private Long id;
    private static final long serialVersionUID = 1L;
    private String icon;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String status;

    private String info;

    private String file;

    private String result;

    private String people;

    private String phone;

    private Integer enable;
}