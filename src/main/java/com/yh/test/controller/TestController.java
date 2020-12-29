package com.yh.test.controller;

import com.yh.test.model.TestDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: TestController
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:17
 * @Description: TODO
 */
@Api(tags = "测试接口")
@RestController
@RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"})
@Slf4j
public class TestController {

    @ApiOperation(value = "获取用户列表",notes = "根据name获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户姓名",dataType = "String",required = true),
            @ApiImplicitParam(name = "age",value = "年龄", example = "1",dataType = "int",required = true)
    })
    @GetMapping("/{name}")
    public TestDO getPerson(@PathVariable("name") String name, @RequestParam int age){
        return new TestDO();
    }

    @ApiOperation(value = "新增用户",notes = "根据用户实体类新增用户")
    @ApiImplicitParam(name = "person",value = "用户实体类",dataType = "TestDO",required = true)
    @PostMapping("add")
    public int addPerson(@RequestBody TestDO person){
        if(person == null){
            return -1;
        }
        return 1;
    }

    @ApiOperation(value = "更新用户信息",notes = "根据用户实体更新用户信息")
    @ApiImplicitParam(name = "person",value = "用户实体类",dataType = "TestDO",required = true)
    @PutMapping("update")
    public int updatePerson(@RequestBody TestDO person){
        if(person == null){
            return -1;
        }
        return 1;
    }

    @ApiOperation(value = "删除用户信息",notes = "根据用户名删除用户信息")
    @ApiImplicitParam(name = "name",value = "用户姓名",dataType = "String",required = true)
    @DeleteMapping("/{name}")
    public int deletePerson(@PathVariable(name = "name") String name){
        if(StringUtils.isEmpty(name)){
            return -1;
        }
        return 1;
    }

}