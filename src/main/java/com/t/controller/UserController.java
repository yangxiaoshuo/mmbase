package com.t.controller;

import com.alibaba.fastjson.JSON;
import com.t.Model.UserT;
import com.t.ServiceInterface.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by yangxiaoshuo on 2017/4/1.
 */
@Controller

public class UserController {
    @Resource
    private IUserService us;

    @RequestMapping("/user.ac")
    public void TestUser(){
        System.out.println(us);
        try
        {
            UserT ut = us.getUserById(1);
            System.out.println(JSON.toJSONString(ut));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}
