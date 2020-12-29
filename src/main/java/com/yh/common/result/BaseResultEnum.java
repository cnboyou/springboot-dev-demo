package com.yh.common.result;

import com.yh.common.base.CodeEnum;

/**
 * ClassName: BaseResultEnum
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 11:51
 * @Description: TODO
 */
public enum BaseResultEnum implements CodeEnum {
    SUCCESS(200,"请求成功"),
    REQUEST_ERROR(400, "请求错误"),
    ERROR(500,"未知异常"),
    FILE_UPLOAD_ERROR(600,"文件上传错误"),
    ERROR_EMPTY_RESULT(1001,"查询结果为空"),
    ERROR_INCOMPLETE_RESULT(1002,"请求参数不全");

    private Integer code;
    private String msg;

    BaseResultEnum(Integer code, String msg) {
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