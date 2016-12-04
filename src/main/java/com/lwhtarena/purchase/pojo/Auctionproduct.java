package com.lwhtarena.purchase.pojo;

import java.io.Serializable;

/**
 * 竞拍商品表
 * @author lwh
 * @folder com.lwhtarena.purchase.pojo
 * @date 2016/8/4.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class Auctionproduct implements Serializable {

    private Integer auctionProductId;

    /*商品id*/
    private Integer fkProductId;

    /*开始竞拍时间  yyyyMMddHHmmss */
    private String auctionStartDate;

    /*竞拍结束时间   yyyyMMddHHmmss*/
    private String auctionEndDate;

    /*拍购总人数*/
    private String auctionCount;

    private String attribute62;

    private String attribute63;

}
