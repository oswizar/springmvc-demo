/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: HelloView
 * Author:   xiexing
 * Date:     2019/1/21 11:11
 * Description:
 */
package com.xiexing.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

@Component
public class HelloView implements View {

    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().print("hello view,time : " + new Date());
    }
}
