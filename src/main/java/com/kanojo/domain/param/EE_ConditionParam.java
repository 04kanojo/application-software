package com.kanojo.domain.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EE_ConditionParam {
    private String name;

    private String address;

    private int status;
}
