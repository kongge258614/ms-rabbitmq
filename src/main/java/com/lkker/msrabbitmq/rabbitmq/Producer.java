package com.lkker.msrabbitmq.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author liliang
 * @Date 2019/5/12 12:23
 * @Description
 **/

@Component
public class Producer {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String deliverytag,String message){
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(deliverytag);
        rabbitTemplate.convertAndSend("lkker-topicExchange", "lkker.test001", message,correlationData );
        logger.info("---消息发送成功---");
    }
}
