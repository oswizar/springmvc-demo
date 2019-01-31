/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: FirstInterceptor
 * Author:   xiexing
 * Date:     2019/1/29 13:34
 * Description: 自定义拦截器
 */
package com.xiexing.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor {

    /**
     * 该方法在目标方法执行之前被调用
     * 若返回 true ,则继续调用后续的拦截器和目标方法
     * 若返回 false,则不会再调用后续的拦截器和目标方法
     *
     * 可以考虑做权限，日志，事务等
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("[FirstInterceptor]  preHandle");
        return true;
    }

    /**
     * 调用方法之后，在渲染视图之前
     * 可以对请求域中的属性和视图做出修改
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("[FirstInterceptor]  postHandle");
    }

    /**
     * 渲染视图之后被调用，释放资源
     *
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("[FirstInterceptor]  afterCompletion");
    }
}
