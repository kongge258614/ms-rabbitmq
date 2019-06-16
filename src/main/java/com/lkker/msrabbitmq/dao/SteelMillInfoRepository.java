package com.lkker.msrabbitmq.dao;

import com.lkker.msrabbitmq.model.vo.LogisticsVehicleInfo;
import com.lkker.msrabbitmq.model.vo.SteelAddressInfo;
import com.lkker.msrabbitmq.model.po.SteelMillInformation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author liliang
 * @Date 2019/6/15 10:20
 * @Description
 **/
public interface SteelMillInfoRepository extends JpaRepository<SteelMillInformation,String> {

    /**
     * 此处com.lkker.msrabbitmq.model.SteelAddressInfo必须为全路径，否则会报错，谨记!!!
     * @param status
     * @param pageable
     * @return
     */
    @Query(value = "select new com.lkker.msrabbitmq.model.vo.SteelAddressInfo(steelName,address,yield) from SteelMillInformation smi where smi.status=?1")
    List<SteelAddressInfo> findOrderByYield(int status,Pageable pageable);

    /**
     * 使用JPQL实现复杂的多表联合查询
     * @return
     */
    @Query(value = "select new com.lkker.msrabbitmq.model.vo.LogisticsVehicleInfo(l.logisticsId,l.userId,v.numberPlate,v.vehicleType) from Logistics l,VehicleInfo v where l.numberPlate = v.numberPlate")
    List<LogisticsVehicleInfo> findLogisticsVehicleInfo();

    /**
     * 使用原生SQL实现复杂的夺标联合查询
     * @return
     */
    @Query(nativeQuery = true,value = "SELECT logistics.logistics_id,logistics.user_id,vehicle_info.number_plate,vehicle_info.vehicle_type FROM logistics,vehicle_info WHERE logistics.number_plate=vehicle_info.number_plate")
    List<Object> getLogisticsVehicleInfo();

}
