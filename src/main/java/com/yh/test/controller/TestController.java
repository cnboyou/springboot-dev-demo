package com.yh.test.controller;

import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TestController {

    @GetMapping("/test1")
    public Result test() {
        Result result = new Result();
        return ResultUtil.success();
    }

}