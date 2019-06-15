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

    @Query(value = "SELECT new SteelMillInformation(steelName,address,yield) FROM SteelMillInformation smi where smi.status=?1")
    List<SteelMillInformation> findOrderByYield(int status,Pageable pageable);
}
