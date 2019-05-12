package com.lkker.msrabbitmq.rabbitmq;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author liliang
 * @Date 2019/5/12 16:10
 * @Description
 **/
@Component
public class Consumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RabbitListener(queues = "lkker-queue001")
    @RabbitHandler
    public void onMessage(Message message, Channel channel) throws IOException {
        logger.info("-------消费者开始消费消息------");
        long deliverytag = message.getMessageProperties().getDeliveryTag();
        String msg = new String(message.getBody());
        logger.info("------deliverytag:"+deliverytag+"-------msg:"+msg);
        
        channel.basicAck(deliverytag, false);
    }
}
