package com.yh.test.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.yh.constant.test.TestSQL.TEST_ID;
import static com.yh.constant.test.TestSQL.TEST_NAME;
import static com.yh.constant.test.TestSQL.TEST_TABLE_NAME;

/**
 * ClassName: TestDO
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 15:00
 * @Description: TODO
 */
@ApiModel(value = "TestDO", description = "测试实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(TEST_TABLE_NAME)
public class TestDO {

    @ApiModelProperty(name = "testId" , value = "测试id")
    @TableId(value = TEST_ID, type = IdType.AUTO)
    private Integer testId;
    @ApiModelProperty(name = "testName", value = "测试名称")
    @TableField(value = TEST_NAME)
    private String testName;

}