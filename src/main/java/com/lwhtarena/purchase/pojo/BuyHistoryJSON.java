package com.lwhtarena.purchase.pojo;

/**
 * @author lwh
 * @folder com.lwhtarena.purchase.pojo
 * @date 2016/8/4.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class BuyHistoryJSON {
    private Integer productId;
    private String productName;
    private String productTitle;
    private String productImg;
    private Integer productPeriod; //商品期数
    private Integer buyStatus;//商品状态
    private String winUser; //获得者
    private String buyTime; //购买时间
    private Long buyCount; //购买总数
    private Integer historyId; //购买记录ID
    private Integer winUserId; //获得者ID
    private Integer winId; //幸运编号
    private String winDate; //揭晓时间
    private Integer spellbuyCount; //当前购买数
    private Integer productPrice;//商品价格
}
