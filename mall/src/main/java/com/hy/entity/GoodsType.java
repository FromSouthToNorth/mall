package com.hy.entity;

public class GoodsType {

    private Integer id;
    private String type;

    public GoodsType() {
    }

    public GoodsType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
