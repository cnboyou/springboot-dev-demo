package com.yh.security.filter;

import cn.hutool.json.JSONUtil;
import com.yh.common.result.ResultUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.yh.common.result.BaseResultEnum.UNAUTHORIZED;

/**
 * ClassName: RestAuthenticationEntryPoint
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 18:01
 * @Description: 当未登录或者token失效访问接口时，自定义的返回结果
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONUtil.parse(ResultUtil.error(UNAUTHORIZED)));
        response.getWriter().flush();
    }
}