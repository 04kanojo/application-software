package com.kanojo.domain.san;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Enterprise implements Serializable {
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
    private Integer code;

    /**
     *
     */
    private String registerAddress;

    /**
     *
     */
    private String organizationType;

    /**
     *
     */
    private String properties;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private String legalPerson;

    /**
     *
     */
    private String idCard;

    /**
     *
     */
    private String unitAddress;

    /**
     *
     */
    private String managementScope;

    /**
     *
     */
    private String info;

    /**
     *
     */
    private String businessLicense;

    /**
     *
     */
    private Date businessLicenseExpiration;

    /**
     *
     */
    private String idCardScannedCopy;

    /**
     *
     */
    private String accountBank;

    /**
     *
     */
    private String bankCard;

    /**
     *
     */
    private String accountBankAddress;

    /**
     *
     */
    private String unitRegisterPhone;

    /**
     *
     */
    private String unitRegisterAddress;

    /**
     *
     */
    private Integer registerMoney;

    /**
     *
     */
    private Integer paidInMoney;

    /**
     *
     */
    private String license;

    private static final long serialVersionUID = 1L;
}