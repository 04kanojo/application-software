package com.kanojo.common.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParam {
    private Integer cur = 0;

    private Integer size = 5;
}
