package com.example.springboot.dao;

import com.example.springboot.pojo.Departmen;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmenMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Departmen record);

    int insertSelective(Departmen record);

    Departmen selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Departmen record);

    int updateByPrimaryKey(Departmen record);

    List<Departmen> list();
}