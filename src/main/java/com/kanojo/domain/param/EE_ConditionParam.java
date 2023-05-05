package com.kanojo.domain.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EE_ConditionParam implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    private String address;

    private int status;
}
