package com.lkker.msrabbitmq.model.po;

import javax.persistence.*;

/**
 * @Author liliang
 * @Date 2019/6/16 15:00
 * @Description 车辆信息
 **/
@Entity
@Table(name = "vehicle_info")
public class VehicleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 车牌号
    @Column(name = "number_plate")
    private String numberPlate;

    // 车辆类型
    @Column(name = "vehicle_type")
    private String vehicleType;

    // 车主id
    @Column(name = "vehicle_user_id")
    private String vehicleUserId;

    // 驾驶证
    @Column(name = "driving_license")
    private String drivingLicenseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVehicleUserId() {
        return vehicleUserId;
    }

    public void setVehicleUserId(String vehicleUserId) {
        this.vehicleUserId = vehicleUserId;
    }

    public String getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(String drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }
}
