/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: HelloWorldController
 * Author:   xiexing
 * Date:     2019/1/10 16:55
 * Description:
 */
package com.xiexing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        System.out.println("hello world!");
        return "success";
    }
}
