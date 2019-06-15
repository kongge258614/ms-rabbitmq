package com.lkker.msrabbitmq.dao;

import com.lkker.msrabbitmq.model.SteelAddressInfo;
import com.lkker.msrabbitmq.model.SteelMillInformation;
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

    @Query(value = "SELECT smi.steel_name,smi.address,smi.yield FROM steel_mill_information smi ORDER BY smi.yield DESC LIMIT 2",nativeQuery = true)
    List<SteelAddressInfo> findOrderByYield(Pageable pageable);
}
