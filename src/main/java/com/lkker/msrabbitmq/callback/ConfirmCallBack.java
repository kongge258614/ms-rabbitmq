package com.lkker.msrabbitmq.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author liliang
 * @Date 2019/5/12 12:19
 * @Description
 **/
@Component
public class ConfirmCallBack implements RabbitTemplate.ConfirmCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // 指定 ConfirmCallBack
    @PostConstruct
    public void initRabbitTemplate(){
        rabbitTemplate.setConfirmCallback(this);
    }

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("-----------生产者端收到来自broker的反馈消息--------");

    }
}
