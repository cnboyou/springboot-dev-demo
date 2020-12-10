package com.yh.common.result;

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
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}