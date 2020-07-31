package com.example.springboot.controller;

import com.example.springboot.Service.User2Service;
import com.example.springboot.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author Mr.X
 **/
//:restController其实就是@Controller和@ResponseBody注解加在一起,返回数据用
@Controller
public class FristController extends Cors {
    @Autowired
    User2Service user2Service;

    //界面初始化
    @RequestMapping("Frist")
    public String FristHtml() {
        return "user2/First";
    }

    @RequestMapping("Frist/StartList")
    @ResponseBody
    public HashMap<String, Object> Html(User2 user2) {
        System.out.println(user2);
        return user2Service.FindUser(user2);
    }

    @RequestMapping(method = RequestMethod.POST, value = "Frist/Update")
    @ResponseBody
    public int Ajaxupdate(User2 u) {
        System.out.println(u);
        return user2Service.update(u);
    }

    @RequestMapping(value = "Frist/Add", method = RequestMethod.POST)
    @ResponseBody
    public int AjaxAdd(User2 u) {
        if (u.getIfdelete() == null)
            u.setIfdelete(0);
        return user2Service.Add(u);
    }

    @RequestMapping(value = "Frist/Delete", method = RequestMethod.POST)
    @ResponseBody
    public int AjaxDelete(User2 u) {
        return user2Service.update(u);
    }

    //批量删除
    @RequestMapping(value = "Frist/Deletes", produces = "application/json;charset=utf-8")
    @ResponseBody
    public int AjaxDeletes(@RequestBody User2[] user2) {
        int a = 0;
        for (User2 user21 : user2) {
            if (user2Service.update(user21) > 0)
                a++;
        }
        return a;
    }

}
