package com.lwhtarena.purchase.pojo;

import java.io.Serializable;

/**
 * 竞拍记录表
 * @author lwh
 * @folder com.lwhtarena.purchase.pojo
 * @date 2016/8/4.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class Auctionrecord implements Serializable {

    private Integer auctionRecordId;

    /*竞拍商品id*/
    private Integer fkAuctionProductId;

    /*竞拍人*/
    private Integer bidder;

    /*竞拍价*/
    private Integer bidderPrice;

    /*竞拍时间*/
    private String bidderDate;

    /*拼购随机码*/
    private String arRandomNo;

    /*中奖状态  0:未中奖   1:中奖  2:未中奖差价购买*/
    private String arWinningStatus;

    /*竞拍状态   本次竞拍是否成功. 0:未完成1:已完成*/
    private String bidderStatus;

    private String attribute68;

    private String attribute69;

}
