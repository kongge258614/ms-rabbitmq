package com.lkker.msrabbitmq.service;

import com.lkker.msrabbitmq.model.SteelAddressInfo;
import com.lkker.msrabbitmq.model.SteelMillInformation;

import java.util.List;

/**
 * @Author liliang
 * @Date 2019/6/15 10:18
 * @Description
 **/
public interface SteelMillInfoService {

    List<SteelMillInformation> getSteelMillInfoList();

    List<SteelMillInformation> getSteelAddressInfo();
}
