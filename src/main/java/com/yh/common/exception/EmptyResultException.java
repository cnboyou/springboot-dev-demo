package com.yh.common.exception;

import com.yh.common.base.CodeEnum;
import lombok.Data;

/**
 * ClassName: EmptyResultException
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 11:40
 * @Description: TODO
 */
@Data
public class EmptyResultException extends RuntimeException {

    private int code;
    private String msg;

    public EmptyResultException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }
}