package com.hy.service.impl;

import com.hy.BaseTest;
import com.hy.entity.Goods;
import com.hy.service.GoodsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImplTest extends BaseTest {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void testGoods() {
        List<Goods> allGoods = goodsService.findAllGoods();
        for (Goods allGood : allGoods) {
            System.out.println(allGood);
        }
    }

}
