package com.kanojo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@TableName(value ="order_delivery")
@Data
public class OrderDelivery implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 
     */
    private Long deliverymanId;

    /**
     * 
     */
    private Long addressId;

    /**
     * 
     */
    private Long orderId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}