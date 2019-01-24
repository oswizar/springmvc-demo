/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: DateUtils
 * Author:   xiexing
 * Date:     2019/1/17 14:31
 * Description: 日期计算
 */
package com.xiexing.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtils {

    public static void dayOfYear(String time) {
        try {
//            System.out.print("请按格式输入年-月-日：\n");
//            Scanner dateStr = new Scanner(System.in);
//            String time = dateStr.nextLine();
            System.out.println(time);
            DateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            Date date = fm.parse(time);
            System.out.println(date);

            String Year = String.format("%tY", date);
            int year = Integer.parseInt(Year);
            String Mon = String.format("%tm", date);
            String Day = String.format("%td", date);

            Boolean flag = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (flag) {
                System.out.println(Year + "年" + "是闰年!");
            } else {
                System.out.println(Year + "年" + "是平年!");
            }
            //得到time日期是在这年的第几天
            String sum = String.format("%tj", date);
            System.out.println(Year + "年" + Mon + "月" + Day + "日,是这一年的第" + sum + "天");
        } catch (ParseException e) {
            System.out.println("日期输入有误!!!");
            e.printStackTrace();
        }

    }
//        System.out.print("请输入年：");
//        Scanner s1 = new Scanner(System.in);
//        int Year = s1.nextInt();
//        System.out.println(Year);
//        System.out.print("请输入月：");
//        Scanner s2 = new Scanner(System.in);
//        int Mon = s2.nextInt();
//        System.out.print("请输入日：");
//        Scanner s3 = new Scanner(System.in);
//        int Day = s3.nextInt();
//        int sum = 0;
//
//        switch (Mon) {
//            case 12:
//                sum += 30;
//            case 11:
//                sum += 31;
//            case 10:
//                sum += 30;
//            case 9:
//                sum += 31;
//            case 8:
//                sum += 31;
//            case 7:
//                sum += 30;
//            case 6:
//                sum += 31;
//            case 5:
//                sum += 30;
//            case 4:
//                sum += 31;
//            case 3:
//                if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
//                    System.out.println("这一年是闰年！");
//                    sum += 29;
//                } else {
//                    System.out.println("这一年是平年！");
//                    sum += 28;
//                }
//            case 2:
//                sum += 31;
//            case 1:
//                sum += Day;
//        }
//        System.out.println(Year + "年" + Mon + "月" + Day + "日,是这一年的第：" + sum + "天");
//    }

}
