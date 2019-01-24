/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: EmployeeController
 * Author:   xiexing
 * Date:     2019/1/21 17:01
 * Description:
 */
package com.xiexing.controller;

import com.xiexing.dao.DepartmentDao;
import com.xiexing.dao.EmployeeDao;
import com.xiexing.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;




    @RequestMapping("/testConversionServiceConverter")
    public String testConversionServiceConverter(Employee employee) {
        System.out.println("save: " + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 为修改操作提供未修改字段默认填充
     * @param id
     * @param map
     */
    @ModelAttribute
    public void getEmployee(@RequestParam(value = "id",required = false) Integer id,
                            Map<String,Object> map) {
        // 判断是否修改操作
        if(id != null) {
            map.put("employee",employeeDao.get(id));
        } else {
            System.out.println("id为空，不进行修改!");
        }
    }

    /**
     * 员工修改
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.PUT)
    public String update(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 员工修改之前回显
     * @param id
     * @param map
     * @return
     */
    @RequestMapping(value = "/emp/{id}")
    public String edit(@PathVariable("id") Integer id, Map<String,Object> map) {
        map.put("employee",employeeDao.get(id));
        map.put("departments",departmentDao.getDepartmentMap());
        return "input";
    }

    /**
     * 员工删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }

    /**
     * 添加员工操作
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String save(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 添加员工前初始化部门下拉选项
     * @param map
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String input(Map<String,Object> map) {
        map.put("departments",departmentDao.getDepartmentMap());
        map.put("employee",new Employee());
        return "input";
    }


    /**
     * 员工列表展示
     * @param map
     * @return
     */
    @RequestMapping("/emps")
    public String list(Map<String,Object> map, HttpServletRequest request) {
        map.put("employees",employeeDao.getEmployeeMap());
        System.out.println(map);

        System.out.println("============================");
        System.out.println("request.getContextPath():"+request.getContextPath());
        System.out.println("request.getServletPath():"+request.getServletPath());
        System.out.println("request.getRequestURI():"+request.getRequestURI());
        System.out.println("request.getRealPath(\"/\"):"+request.getRealPath("/"));

        // 返回结果到 list.jsp 页面进行展示
        return "list";
    }


}
