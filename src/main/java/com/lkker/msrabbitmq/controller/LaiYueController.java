package com.lkker.msrabbitmq.controller;

import com.lkker.msrabbitmq.model.SteelMillInformation;
import com.lkker.msrabbitmq.service.SteelMillInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liliang
 * @Date 2019/6/15 10:04
 * @Description
 **/
@Api(description = "青岛莱月", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "/laiyue",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LaiYueController {

    @Autowired
    private SteelMillInfoService steelMillInfoService;

    /**
     * 查询全部的钢厂信息
     * @return
     */
    @GetMapping("/steelmillinfo")
    public List<SteelMillInformation> steelMillInformation(){
        List<SteelMillInformation> steelMillInfoList = steelMillInfoService.getSteelMillInfoList();
        return steelMillInfoList;
    }

}
