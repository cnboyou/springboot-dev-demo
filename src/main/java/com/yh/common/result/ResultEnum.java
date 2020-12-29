package com.yh.common.result;

import com.yh.common.base.CodeEnum;

/**
 * ClassName: ResultEnum
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:25
 * @Description: TODO
 */
public enum ResultEnum implements CodeEnum {

    REQUEST_ERROR(400, "请求错误");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getMsg() {
        return null;
    }
}