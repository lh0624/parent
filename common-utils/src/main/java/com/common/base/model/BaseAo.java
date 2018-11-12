package com.common.base.model;

import com.common.base.consts.PageParams;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  li.hao
 * @date 2018/10/31 10:26
 */
@Data
public class BaseAo implements Serializable {

    public static final String CREATE_TIME = "createTime";

    private Integer pageNum = PageParams.PAGE_NUM;

    private Integer pageSize = PageParams.PAGE_SIZE;

    private Long primaryKey;

    private String openId;

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createTime;
}
