package com.yh.test.controller;

import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:17
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"})
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test1")
    public Result test() {
        Result result = new Result();

        return ResultUtil.success();
    }

}