package com.yh.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /*@ExceptionHandler(value = RuntimeException.class)
    public GeneralResult handle(HttpServletRequest request, Exception exception) throws Exception {
        logger.error("error:", exception);
        return ResultUtil.error("03000",
                URLDecoder.decode(request.getRequestURI(), "UTF-8"),
                exception.getMessage());
    }*/
}