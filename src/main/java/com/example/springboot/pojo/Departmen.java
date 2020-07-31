package com.example.springboot.pojo;

public class Departmen {
    private Integer did;

    private String dname;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Departmen{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}