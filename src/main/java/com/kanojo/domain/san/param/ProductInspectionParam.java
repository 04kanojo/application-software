package com.kanojo.domain.san.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInspectionParam {
    private Long id;

    private Integer number;

    private Integer orderNumber;

    private Integer planNumber;

    private String homewordName;

    private String productName;

    private String batch;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date productionStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date productionEndTime;

    private String checkout;

    private String checkoutResult;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkoutStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkoutEndTime;

    private String checkoutPeople;
}
