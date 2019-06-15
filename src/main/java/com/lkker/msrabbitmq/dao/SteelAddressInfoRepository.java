package com.lkker.msrabbitmq.dao;

import com.lkker.msrabbitmq.model.SteelAddressInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author liliang
 * @Date 2019/6/15 11:19
 * @Description
 **/
public interface SteelAddressInfoRepository extends JpaRepository<SteelAddressInfo,String> {

    @Query(value = "SELECT smi.steel_name,smi.address,smi.yield FROM steel_mill_information smi ORDER BY smi.yield DESC LIMIT 2",nativeQuery = true)
    List<SteelAddressInfo> findOrderByYield();
}
