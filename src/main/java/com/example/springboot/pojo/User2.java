package com.example.springboot.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User2 {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private Date time;

    private Integer ifdelete;

    private Integer did;
    private Departmen departmen;

    public Departmen getDepartmen() {
        return departmen;
    }

    public void setDepartmen(Departmen departmen) {
        this.departmen = departmen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTime() {
        if (this.time != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(this.time);
        }
        return null;
    }

    public void setTime(String time) throws Exception {
        if (time != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.time = sdf.parse(time);
        } else {
            this.time = new Date();

        }
    }

    public Integer getIfdelete() {
        return ifdelete;
    }

    public void setIfdelete(Integer ifdelete) {
        this.ifdelete = ifdelete;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", time=" + time +
                ", ifdelete=" + ifdelete +
                ", did=" + did +
                ", departmen=" + departmen +
                '}';
    }
}