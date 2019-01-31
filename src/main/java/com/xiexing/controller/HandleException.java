/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: HandleException
 * Author:   xiexing
 * Date:     2019/1/30 15:56
 * Description:
 */
package com.xiexing.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandleException {

    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView handleArithmeticException(Exception e) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception",e);
        System.out.println("[出异常了!!!]------>" + e);
        return mv;
    }
}
