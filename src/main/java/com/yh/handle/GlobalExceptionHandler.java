package com.yh.handle;

import com.yh.common.exception.EmptyResultException;
import com.yh.common.exception.RequestParamException;
import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.yh.common.result.BaseResultEnum.ERROR;

/**
 * ClassName: GlobalExceptionHandler
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:00
 * @Description: TODO
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public Result exceptionHandler(Exception exception) {
        log.error("未知异常:", exception);
        return ResultUtil.error(ERROR);
    }

    @ExceptionHandler(value = EmptyResultException.class)
    public Result emptyExceptionHandler(EmptyResultException exception) {
        log.error("查询结果为空:", exception);
        return ResultUtil.error(exception.getCode(), exception.getMessage(), null);
    }

    @ExceptionHandler(value = RequestParamException.class)
    public Result requestParamExceptionHandler(RequestParamException exception) {
        log.error("请求参数不合法:", exception);
        return ResultUtil.error(exception.getCode(), exception.getMessage(), null);
    }
}