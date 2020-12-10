package com.yh.handle;

import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

/**
 * ClassName: ExceptionHandle
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:00
 * @Description: TODO
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = RuntimeException.class)
    public Result handle(HttpServletRequest request, Exception exception) throws Exception {
        logger.error("error:", exception);
        return ResultUtil.error(03000,
                URLDecoder.decode(request.getRequestURI(), "UTF-8"),
                exception.getMessage());
    }
}