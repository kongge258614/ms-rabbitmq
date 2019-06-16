package com.lkker.msrabbitmq.dao;

import com.lkker.msrabbitmq.model.po.SteelMillInformation;
import com.lkker.msrabbitmq.model.vo.LogisticsVehicleInfo;
import com.lkker.msrabbitmq.model.vo.SteelAddressInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * @Author liliang
 * @Date 2019/6/15 10:20
 * @Description
 **/
public interface SteelMillInfoRepository extends JpaRepository<SteelMillInformation,String> {

    /**
     * 此处com.lkker.msrabbitmq.model.SteelAddressInfo必须为全路径，否则会报错，谨记!!!
     * 只需要将pageable参数传入即可，jpa自己给我们处理。
     * @param status
     * @param pageable
     * @return
     */
    @Query(value = "select new com.lkker.msrabbitmq.model.vo.SteelAddressInfo(steelName,address,yield) from SteelMillInformation smi where smi.status=?1")
    List<SteelAddressInfo> findOrderByYield(int status,Pageable pageable);

//    @Query(value = "select new com.lkker.msrabbitmq.model.vo.SteelAddressInfo(steelName,address,yield) from SteelMillInformation smi")
//    List<SteelAddressInfo> findOrderByYield(Pageable pageable);


    /**
     * 使用JPQL实现复杂的多表联合查询
     * @return
     */
    @Query(value = "select new com.lkker.msrabbitmq.model.vo.LogisticsVehicleInfo(l.logisticsId,l.userId,v.numberPlate,v.vehicleType) from Logistics l,VehicleInfo v where l.numberPlate = v.numberPlate")
    List<LogisticsVehicleInfo> findLogisticsVehicleInfo();

    /**
     * 使用原生SQL实现复杂的多表联合查询  只能通过object来接收数据，然后自己转换成相应的对象。此处的object是关键，否则会报转换异常
     * @return
     */
    @Query(nativeQuery = true,value = "SELECT logistics.logistics_id,logistics.user_id,vehicle_info.number_plate,vehicle_info.vehicle_type FROM logistics,vehicle_info WHERE logistics.number_plate=vehicle_info.number_plate")
    List<Map<String,Object>> getLogisticsVehicleInfo();
}
