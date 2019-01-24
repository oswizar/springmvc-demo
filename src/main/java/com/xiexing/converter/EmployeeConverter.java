/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: EmployeeConverter
 * Author:   xiexing
 * Date:     2019/1/24 14:48
 * Description: 员工转换器
 */
package com.xiexing.converter;

import com.xiexing.entity.Department;
import com.xiexing.entity.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter implements Converter<String, Employee> {

    @Override
    public Employee convert(String s) {
        if(s != null) {
            String[] vals = s.split("-");
            // GG-aa@163.com-1-105
            if (vals != null & vals.length==4) {
                String lastName = vals[0];
                String email = vals[1];
                Integer gender = Integer.parseInt(vals[2]);
                Department department = new Department();
                department.setId(Integer.parseInt(vals[3]));

                Employee employee = new Employee(null,lastName,email,gender,department);
                System.out.println(s + "convert" + employee);
                return employee;
            } else {
                return null;
            }
        }
        return null;
    }
}
