package com.cy.pj.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : lyx
 * @Date : 2020/10/24 15:53
 * @Version : 1.0
 */

@Controller
@RequestMapping("doGoods")
public class DoGoodController {
    @GetMapping("doGoodsPage")
    public String doGoodsPage(){
        return "goods";
    }
}
