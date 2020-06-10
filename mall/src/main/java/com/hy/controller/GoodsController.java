package com.hy.controller;

import com.alibaba.fastjson.JSON;
import com.hy.dto.Result;
import com.hy.entity.Goods;
import com.hy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goodsJson", method = RequestMethod.GET, produces = {
            "application/json; charset=utf-8"
    })
    @ResponseBody
    public String getGoodsJson() {
        List<Goods> allGoods = goodsService.findAllGoods();
        return JSON.toJSONString(new Result<>(true, allGoods));
    }

}
