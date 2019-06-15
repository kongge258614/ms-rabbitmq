package com.lkker.msrabbitmq.dao;

import com.lkker.msrabbitmq.model.SteelMillInformation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author liliang
 * @Date 2019/6/15 10:20
 * @Description
 **/
public interface SteelMillInfoRepository extends JpaRepository<SteelMillInformation,String> {
}
