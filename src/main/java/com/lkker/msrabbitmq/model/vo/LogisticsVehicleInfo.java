package com.lkker.msrabbitmq.model.vo;

/**
 * @Author liliang
 * @Date 2019/6/16 15:22
 * @Description  物流车辆信息
 **/
public class LogisticsVehicleInfo {

    // 物流编号
    private String logisticsId;

    // 司机名称
    private String userName;

    // 车牌号
    private String numberPlate;

    // 车辆类型
    private String vehicleType;

    public LogisticsVehicleInfo(String logisticsId, String userName, String numberPlate, String vehicleType) {
        this.logisticsId = logisticsId;
        this.userName = userName;
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }
}
