package com.zy.cmfz.controller;

import com.zy.cmfz.utils.VCodeUtil;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:zy
 * @Date: 2018-07-05 10:02
 * @Description:
 */
@Controller
public class VCodeController {

    public void getVcode(HttpRequest ){
         VCodeUtil vCode = new VCodeUtil(100, 30, 5, 10);

         session.setAttribute("code", vCode.getCode()); //保存在Session作用
         vCode.write(response.getOutputStream());
    }

}
