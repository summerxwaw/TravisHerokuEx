package com.model;

public class Production {
    private Integer prod_id;
    private String prod_name;
    private String prod_des;
    private Integer prod_number;

    public Production() {

    }

    public Production(Integer prod_id, String prod_name, String prod_des,
                      Integer prod_number) {
        this.prod_id = prod_id;
        this.prod_name= prod_name;
        this.prod_des = prod_des;
        this.prod_number = prod_number;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_des() {
        return prod_des;
    }

    public void setDeptNo(String prod_des) {
        this.prod_des = prod_des;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Integer getProd_number() {
        return prod_number;
    }

    public void setProd_number(Integer prod_number) {
        this.prod_number = prod_number;
    }
}
