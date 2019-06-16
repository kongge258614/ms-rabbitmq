package com.lkker.msrabbitmq.service.impl;

import com.lkker.msrabbitmq.dao.SteelMillInfoRepository;
import com.lkker.msrabbitmq.model.po.SteelMillInformation;
import com.lkker.msrabbitmq.model.vo.LogisticsVehicleInfo;
import com.lkker.msrabbitmq.model.vo.SteelAddressInfo;
import com.lkker.msrabbitmq.service.SteelMillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author liliang
 * @Date 2019/6/15 10:19
 * @Description
 **/
@Service
public class SteelMillInfoServiceImpl implements SteelMillInfoService {

    @Autowired
    private SteelMillInfoRepository steelMillInfoRepository;

    @Override
    public List<SteelMillInformation> getSteelMillInfoList() {
        List<SteelMillInformation> steelMillInformationList = steelMillInfoRepository.findAll();
        return steelMillInformationList;
    }

    @Override
    public List<SteelAddressInfo> getSteelAddressInfo() {
        Sort sort = new Sort(Sort.Direction.DESC,"yield");
        Pageable pageable = PageRequest.of(0, 2, sort);
        List<SteelAddressInfo> steelAddressInfoList = steelMillInfoRepository.findOrderByYield(0,pageable);
//        List<SteelAddressInfo> steelAddressInfoList = steelMillInfoRepository.findOrderByYield(pageable);
        return steelAddressInfoList;
    }

    @Override
    public List<LogisticsVehicleInfo> findLogisticsVehicleInfo() {
        List<LogisticsVehicleInfo> logisticsVehicleInfoList = steelMillInfoRepository.findLogisticsVehicleInfo();
        return logisticsVehicleInfoList;
    }

    @Override
    public List<LogisticsVehicleInfo> getLogisticsVehicleInfo() {
//        List<LogisticsVehicleInfo> logisticsVehicleInfoList = steelMillInfoRepository.getLogisticsVehicleInfo();
        List<Map<String, Object>> logisticsVehicleInfoMap = steelMillInfoRepository.getLogisticsVehicleInfo();
        List<LogisticsVehicleInfo> logisticsVehicleInfoList = new ArrayList<>();
        for (Map<String, Object> map:logisticsVehicleInfoMap){
            LogisticsVehicleInfo logisticsVehicleInfo = new LogisticsVehicleInfo();
            logisticsVehicleInfo.setLogisticsId((String) map.get("logistics_id"));
            logisticsVehicleInfo.setUserId((String) map.get("user_id"));
            logisticsVehicleInfo.setNumberPlate((String) map.get("number_plate"));
            logisticsVehicleInfo.setVehicleType((String) map.get("vehicle_type"));
            logisticsVehicleInfoList.add(logisticsVehicleInfo);
        }

        return logisticsVehicleInfoList;
    }
}
