package com.example.springboot.Service;

import com.example.springboot.dao.DepartmenMapper;
import com.example.springboot.dao.User2Mapper;
import com.example.springboot.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

/**
 * @author Mr.X
 **/
@Service
public class User2Service {
    @Autowired
    User2Mapper user2Mapper;
    @Autowired
    DepartmenMapper departmenMapper;

    public HashMap<String, Object> FindUser(User2 user2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("List", user2Mapper.selectALL(user2));
        System.out.println(user2);
        map.put("DeList", departmenMapper.list());
        return map;
    }

    //开启一级缓存
    @Transactional
    public int Add(User2 u) {
        return user2Mapper.insertSelective(u);
    }

    //开启一级缓存
    @Transactional
    public int update(User2 u) {
        return user2Mapper.updateByPrimaryKeySelective(u);
    }

//    public int updates(List<String> is,int ifid) {
//        int all=0;
//        for (String i:is) {
//            int id =Integer.parseInt(i);
//            User2 user2=new User2();
//            user2.setId(id);
//            user2.setIfdelete(ifid);
//            System.out.println(user2);
//          all+=user2Mapper.updateByPrimaryKeySelective(user2);
//        }
//        return all;
//    }

    public HashMap<String, Object> FindUser2(User2 user2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("List", user2Mapper.selectALL2(user2));
        System.out.println(user2);
        map.put("DeList", departmenMapper.list());
        return map;
    }
}
