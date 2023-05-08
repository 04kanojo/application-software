package com.kanojo.domain.er;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductModel implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String product;

    /**
     *
     */
    private String productModelNumber;

    /**
     *
     */
    private String specifications;

    /**
     *
     */
    private String unit;

    /**
     *
     */
    private String note;

    private static final long serialVersionUID = 1L;
}