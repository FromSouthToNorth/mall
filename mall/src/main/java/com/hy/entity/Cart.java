package com.hy.entity;

public class Cart {

    private Integer id;
    private Integer userId;
    private Integer goodsId;

    private Users users;
    private Goods goods;

    public Cart() {
    }

    public Cart(Integer id, Integer userId, Integer goodsId, Users users, Goods goods) {
        this.id = id;
        this.userId = userId;
        this.goodsId = goodsId;
        this.users = users;
        this.goods = goods;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
