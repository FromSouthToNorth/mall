package com.hy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {

    private Integer id;
    private String goodsName;
    private BigDecimal price;
    private String goodsTitle;
    private String goodsImg;
    private Integer goodsTypeId;
    private GoodsType goodsType;
    private Date registerDate;
    private Date updateDate;

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                ", goodsType=" + goodsType +
                ", registerDate=" + registerDate +
                ", updateDate=" + updateDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Goods(Integer id, String goodsName, BigDecimal price, String goodsTitle, String goodsImg, Integer goodsTypeId, GoodsType goodsType, Date registerDate, Date updateDate) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsTitle = goodsTitle;
        this.goodsImg = goodsImg;
        this.goodsTypeId = goodsTypeId;
        this.goodsType = goodsType;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
    }
}
