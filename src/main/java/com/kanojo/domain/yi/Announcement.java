package com.kanojo.domain.yi;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Announcement implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private String icon;
    /**
     *
     */
    private String name;
    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     *
     */
    private String message;
    /**
     *
     */
    private String enterprise;
    /**
     *
     */
    private String attachments;
}