package com.yh.common.result;

import lombok.NoArgsConstructor;

/**
 * ClassName: ResultUtil
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:20
 * @Description: TODO
 */
@NoArgsConstructor
public class ResultUtil {
    public static Result success(Object data) {
        return new Result(true, null, (String)null, data);
    }

    public static Result success() {
        return success((Object)null);
    }

    public static Result error(Integer errorCode, String errorMsg, Object data) {
        return new Result(false, errorCode, errorMsg, data);
    }

    public static Result error(CodeEnum resultEnum, Object data) {
        return error(resultEnum.getCode(), resultEnum.getMsg(), data);
    }

    public static Result error(CodeEnum resultEnum) {
        return error(resultEnum, (Object)null);
    }

    public static Result error(String msg) {
        return error(400, msg, (Object)null);
    }
}