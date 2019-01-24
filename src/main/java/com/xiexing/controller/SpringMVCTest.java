/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: SpringMVCTest
 * Author:   xiexing
 * Date:     2019/1/11 9:57
 * Description:
 */
package com.xiexing.controller;

import com.xiexing.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/springmvc")
//@SessionAttributes(value = {"user"},types = {String.class})
public class SpringMVCTest {

    private static final String SUCCESS = "success";

    /**
     * test Forward(转发)
     */
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("test forward");
        return "forward:/WEB-INF/views/success.jsp";
    }

    /**
     * test Redirect(重定向)
     */
    @RequestMapping("testRedirect")
    public String testRedirect() {
        System.out.println("test redirect");
        return "redirect:http://www.baidu.com";
    }

    /**
     * test view
     */
    @RequestMapping("/testView")
    public String testView () {
        System.out.println("test view");
        return "helloView";
    }




    /**
     * 测试ViewAndViewResolver
     */
    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver() {
        System.out.println("testViewAndViewResolver");
        return SUCCESS;
    }









    /**
     * 测试@ModelAttribute
     */
    @ModelAttribute
    public void getUser(@RequestParam(value = "userId",required = false) Integer id,
                        Map<String,Object> map) {
        if (id != null){
            //模拟从数据库获取数据
            User user = new User(1,"xiaoming", "1yuyiig");
            System.out.println("从数据库获取的对象：" + user);
            map.put("user",user);
        }
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("修改后的对象：" + user);
        return SUCCESS;
    }


    /**
     * 测试@SessionAttributes
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){
        User user = new User(1,"xiaoming","123456");
        map.put("user",user);
        map.put("school","sdust");
        return SUCCESS;
    }



    /**
     * 使用method属性来指定请求方式
     * @return
     */
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("testMethod");
        return SUCCESS;
    }


    /**
     * 测试params和headers
     *
     */
    @RequestMapping(value = "/testParamsAndHeaders",params = {"username","age!=10"})
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }


    /**
     * 测试@PathVariable注解
     * 该注解可以映射URL中的占位符到目标方法的参数中
     */
    @RequestMapping(value = "/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer idNo) {
        System.out.println("testPathVariable:" + idNo);
        return SUCCESS;

    }

    /**
     * 测试Rest GET
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id) {
        System.out.println("testRest GET:" + id);
        return SUCCESS;
    }
    /**
     * 测试Rest POST
     */
    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRestPost() {
        System.out.println("testRest POST");
        return SUCCESS;
    }
    /**
     * 测试Rest DELETE
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable("id") Integer id) {
        System.out.println("testRest DELETE:" + id);
        return SUCCESS;
    }
    /**
     * 测试Rest PUT
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    public String testRestPut(@PathVariable("id") Integer id) {
        System.out.println("testRest PUT:" + id);
        return SUCCESS;
    }


    /**
     * 测试@RequestParam
     */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "name") String name,
                                   @RequestParam(value = "age",required = false,defaultValue = "0") int age) {
        System.out.println("testRequestParam name:" + name + "age:" + age);
        return SUCCESS;
    }

    /**
     * 测试@CookieValue
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String session) {
        System.out.println("testCookieValue CookieValue:" + session);
        return SUCCESS;
    }

    /**
     * 测试pojo
     */
    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user) {
        System.out.println("User:" + user);
        return SUCCESS;
    }

    /**
     * 测试Servlet原生API
     */
    @RequestMapping(value = "testServletAPI")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
        System.out.println("request:" + request + "\nresponse:" + response);
        out.write("hello writer");
//        return SUCCESS;
    }

    /**
     * 测试ModelAndView
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        //String view = SUCCESS;
        ModelAndView mav = new ModelAndView(SUCCESS);
        mav.addObject("time",new Date());
        System.out.println(mav);
        return mav;
    }

    /**
     * 测试Map
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map) {
        System.out.println(map.getClass().getName());
        map.put("user", Arrays.asList("tom","cat","apache"));
        System.out.println(map.get("user"));
        return SUCCESS;
    }



}
