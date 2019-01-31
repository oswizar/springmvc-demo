/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: SpringController
 * Author:   xiexing
 * Date:     2019/1/28 15:20
 * Description:
 */
package com.xiexing.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

//@Slf4j
@Controller
public class SpringViewController {


    private static final Logger log = LoggerFactory.getLogger(SpringViewController.class);

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
        log.info("logggggggggggggggggggggggggggggggggggggggggggggggg");
        return "hello,HttpMessageConverter" + new Date();
    }


    @RequestMapping("/testLog")
    public String testLog () {
        log.info("testLogggggggggggggggggggggggggggggggggggggggggggg");


        log.error("errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("testLog");
        return "success";
    }

}
