package com.kanojo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@TableName(value ="order_detail")
@Data
public class OrderDetail implements Serializable {
    /**
     * 
     */
    private Long orderId;

    /**
     * 
     */
    private Long goodsId;

    /**
     * 
     */
    private Integer number;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}