package com.lkker.msrabbitmq.model.vo;

/**
 * @Author liliang
 * @Date 2019/6/16 15:22
 * @Description  物流车辆信息
 **/
public class LogisticsVehicleInfo {

    // 物流编号
    private String logisticsId;

    // 司机id
    private String userId;

    // 车牌号
    private String numberPlate;

    // 车辆类型
    private String vehicleType;

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LogisticsVehicleInfo() {
    }

    public LogisticsVehicleInfo(String logisticsId, String userId, String numberPlate, String vehicleType) {
        this.logisticsId = logisticsId;
        this.userId = userId;
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }
}
