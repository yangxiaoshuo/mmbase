package com.t.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.t.Model.UserT;
import com.t.Service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by yangxiaoshuo on 2017/4/1.
 */
@Controller

public class UserController {
    @Resource
    private IUserService us;

    @RequestMapping("/user.ac")
    public void TestUser(HttpServletResponse response){
        System.out.println(us);
        PrintWriter out = null;
        try
        {
            response.setContentType("text/html;charset=utf-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
            response.setHeader("Access-Control-Allow-Credentials","true");
            response.setContentType("application/x-json");

            UserT ut = us.getUserById(1);
            System.out.println(JSON.toJSONString(ut));
            out  = response.getWriter();

            out.print(JSON.toJSONString(ut));
            out.close();
            out = null;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}
