/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: SpringController
 * Author:   xiexing
 * Date:     2019/1/28 15:20
 * Description:
 */
package com.xiexing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class SpringViewController {


    @RequestMapping("/testSimpleMappingExceptionResolver")
    public String testSimpleMappingExceptionResolver(@RequestParam("i") Integer i) {
        String[] vals = new String[10];
        System.out.println(vals[i]);
        return "success";
    }

    @RequestMapping("/testExceptionHandlerExceptionResolver")
    public String testExceptionHandlerExceptionResolver(@RequestParam("i") Integer i) {
        System.out.println("Result: " + (10/i));
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/testHttpMessageConverter")
    public String testHttpMessageConverter(@RequestBody String body) {
        System.out.println(body);
        return "hello,HttpMessageConverter" + new Date();
    }

}
