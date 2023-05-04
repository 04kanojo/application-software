package com.kanojo.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 常见操作信息封装
 */
@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(200, "操作成功"),

    FAILED(500, "操作失败");

    private Integer code;

    private String msg;
}
