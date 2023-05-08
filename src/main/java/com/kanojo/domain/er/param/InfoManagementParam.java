package com.kanojo.domain.er.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoManagementParam {
    private String name;

    private Integer code;

    private Integer modelNumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    private Integer batch;

    private String manufacturer;

    private Integer status;

    private static final long serialVersionUID = 1L;
}
