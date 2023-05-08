package com.kanojo.domain.san.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompletionProductParam {
    private String batch;

    private String note;

    private Long id;
}
