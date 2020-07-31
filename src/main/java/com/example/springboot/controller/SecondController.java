package com.example.springboot.controller;

import com.example.springboot.Service.User2Service;
import com.example.springboot.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author Mr.X
 **/
@Controller
public class SecondController {
    @Autowired
    User2Service user2Service;

    //界面初始化
    @RequestMapping("SecondController")
    public String FristHtml() {
        return "user2/second";
    }

    @RequestMapping("SecondController/StartList")
    @ResponseBody
    public HashMap<String, Object> Html(User2 user2) {
        System.out.println(user2);
        return user2Service.FindUser2(user2);
    }

    @RequestMapping("SecondController/Delete")
    @ResponseBody
    public int AjaxDelete(User2 u) {
        return user2Service.update(u);
    }
}
