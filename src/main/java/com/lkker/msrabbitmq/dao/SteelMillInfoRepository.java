package com.lkker.msrabbitmq.dao;

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

    // 此处com.lkker.msrabbitmq.model.SteelAddressInfo必须为全路径，否则会报错，谨记
    @Query(value = "select new com.lkker.msrabbitmq.model.vo.SteelAddressInfo(steelName,address,yield) from SteelMillInformation smi where smi.status=?1")
    List<SteelAddressInfo> findOrderByYield(int status,Pageable pageable);


}
