package com.yh.common.exception;

import com.yh.common.base.CodeEnum;
import lombok.Data;

/**
 * ClassName: EmtyResultException
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 11:40
 * @Description: TODO
 */
@Data
public class RequestParamException extends RuntimeException {

    private int code;
    private String msg;

    public RequestParamException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }
}