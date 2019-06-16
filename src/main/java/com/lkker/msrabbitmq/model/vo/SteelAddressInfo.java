package com.lkker.msrabbitmq.model.vo;

import java.io.Serializable;

/**
 * @Author liliang
 * @Date 2019/6/15 11:15
 * @Description
 **/

public class SteelAddressInfo implements Serializable {

    private String steelName;

    private String address;

    private double yield;

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

    public SteelAddressInfo() {
    }

    public SteelAddressInfo(String steelName, String address, double yield) {
        this.steelName = steelName;
        this.address = address;
        this.yield = yield;
    }
}
