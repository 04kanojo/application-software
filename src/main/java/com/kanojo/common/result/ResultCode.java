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

    FAILED(500, "操作失败"),

    VALIDATE_FAILED(404, "参数检验失败"),

    UNAUTHORIZED(401, "暂未登录或token已经过期"),

    FORBIDDEN(403, "没有相关权限");

    private Integer code;

    private String msg;


}
