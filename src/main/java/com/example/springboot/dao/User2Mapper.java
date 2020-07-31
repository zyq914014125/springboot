package com.example.springboot.dao;

import com.example.springboot.pojo.User2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User2 record);

    int insertSelective(User2 record);

    User2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User2 record);

    int updateByPrimaryKey(User2 record);

    List<User2> selectALL(User2 user2);

    List<User2> selectALL2(User2 user2);
}