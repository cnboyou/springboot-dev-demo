package com.yh.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

/**
 * ClassName: Result
 *
 * @Author: WangYiHai
 * @Date: 2020/12/10 17:03
 * @Description: TODO
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private boolean status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    private Object data;
}