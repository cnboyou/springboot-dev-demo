package com.yh.security.model;

import lombok.Data;

/**
 * ClassName: UmsAdmin
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 17:56
 * @Description: TODO
 */
@Data
public class UmsAdmin {

    private Integer id;

    private String username;

    private String password;

    private Integer status;

}