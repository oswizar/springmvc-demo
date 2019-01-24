/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: Address
 * Author:   xiexing
 * Date:     2019/1/14 13:41
 * Description:
 */
package com.xiexing.entity;

public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
