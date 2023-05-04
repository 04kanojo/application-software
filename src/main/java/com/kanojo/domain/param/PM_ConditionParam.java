package com.kanojo.domain.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PM_ConditionParam {
    private String projectName;

    private Date startTime;

    private Date endTime;

    private Integer status;
}
