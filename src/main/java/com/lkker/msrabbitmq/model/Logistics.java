package com.lkker.msrabbitmq.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author liliang
 * @Date 2019/6/16 0:06
 * @Description  物流信息
 **/
@Entity
@Table(name = "logistics")
public class Logistics {

    private String id;

    // 物流id
    private String logisticsId;

    // 合同编号
    private String businessNo;

    // 司机名称
    private String userName;

    // 发车手机号
    private String mobile;

    // 车牌号
    private String numberPlate;

    // 货物类型
    private String goodsType;

    // 货物类型名称
    private String goodsTypeName;

    // 出发地
    private String departure;

    // 目的地
    private String destination;

    // 钢厂id
    private String steelId;

    // 供货企业id
    private String supplyCompany;

    // 货物重量
    private Double netWeight;

    // 创建时间
    private Date createAt;

    // 更新时间
    private Date updateAt;

    // 状态
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSteelId() {
        return steelId;
    }

    public void setSteelId(String steelId) {
        this.steelId = steelId;
    }

    public String getSupplyCompany() {
        return supplyCompany;
    }

    public void setSupplyCompany(String supplyCompany) {
        this.supplyCompany = supplyCompany;
    }

    public Double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Double netWeight) {
        this.netWeight = netWeight;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
