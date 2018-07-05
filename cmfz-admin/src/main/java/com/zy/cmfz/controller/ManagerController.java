package com.zy.cmfz.controller;

import com.zy.cmfz.entity.Manager;
import com.zy.cmfz.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:zy
 * @Date: 2018-07-04 19:00
 * @Description:
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    /**
     * 管理员注册
     * @param mgr
     * @return
     */
    @RequestMapping("/register")
    private String register(Manager mgr){
        int result = managerService.add(mgr);
        if(result > 0){
            return "login";
        }else{
            return "register";
        }

    }

    /**
     * 管理员对象
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/login")
    private String login(String name , String password ){

        return "success";
    }

}
