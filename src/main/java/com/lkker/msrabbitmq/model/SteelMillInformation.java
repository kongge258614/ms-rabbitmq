package com.lkker.msrabbitmq.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @Author liliang
 * @Date 2019/6/15 9:47
 * @Description 钢厂信息
 **/
@Entity
@Table(name = "steel_mill_information")
public class SteelMillInformation {
    private int id;

    // 钢厂id
    @Column(name = "steel_id",length = 10)
    @NotNull
    private String steelId;

    // 钢厂名字
    @Column(name = "steel_name")
    private String steelName;

    // 钢厂地址
    private String address;

    // 钢厂产量
    private double yield;

    // 钢厂创建时间
    @Column(name = "creation_time")
    private String creationTime;

    // 状态
    private int status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSteelId() {
        return steelId;
    }

    public void setSteelId(String steelId) {
        this.steelId = steelId;
    }

    public String getSteelName() {
        return steelName;
    }

    public void setSteelName(String steelName) {
        this.steelName = steelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SteelMillInformation(String steelName, String address, double yield) {
        this.steelName = steelName;
        this.address = address;
        this.yield = yield;
    }
}
