package com.lkker.msrabbitmq.service.impl;

import com.lkker.msrabbitmq.dao.SteelMillInfoRepository;
import com.lkker.msrabbitmq.model.SteelMillInformation;
import com.lkker.msrabbitmq.service.SteelMillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
