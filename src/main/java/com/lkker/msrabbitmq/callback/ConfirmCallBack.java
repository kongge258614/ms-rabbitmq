package com.lkker.msrabbitmq.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author liliang
 * @Date 2019/5/12 12:19
 * @Description
 **/
@Component
public class ConfirmCallBack implements RabbitTemplate.ConfirmCallback {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("-----------生产者端收到来自broker的反馈消息--------");

    }
}
