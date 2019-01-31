/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: FileUpload
 * Author:   xiexing
 * Date:     2019/1/28 17:21
 * Description: 文件上传
 */
package com.xiexing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("desc") String desc,
                         @RequestParam("file") MultipartFile file) throws Exception {
        if(!file.isEmpty()) {
            System.out.println(desc);
            System.out.println(file.toString());
            file.transferTo(new File("d:/temp/" + file.getOriginalFilename()));
        }

        return "success";
    }

}
