package com.itheima.controller;



import com.itheima.account.Account;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class Controller03 {

    @RequestMapping("/fileUplodad")
    public String fileUpload(MultipartFile file, HttpServletRequest request) throws IOException {
       /* //获取项目真实路径
        String destPath=request.getServletContext().getRealPath("test01");
        System.out.println(destPath);
        //创建文件
        File file1=new File(destPath);
        if(!file1.exists()){
            file1.mkdir();
        }
        System.out.println(file);*/

        String filename=file.getOriginalFilename();

        String newName=System.currentTimeMillis()+filename.substring(filename.lastIndexOf("."));

        /*File file2=new File(destPath,newName);*/

        /*file.transferTo(file2);*/

        Client client=new Client();

        WebResource resource=client.resource("http://localhost:8089/files/"+newName);

        resource.put(file.getBytes());
        return "/success.jsp";


    }
}
