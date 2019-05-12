package com.lkker.msrabbitmq.controller;

import com.lkker.msrabbitmq.rabbitmq.Producer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author liliang
 * @Date 2019/5/12 12:33
 * @Description
 **/
@Api(description = "rabbitmq", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "/rabbitmq", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RabbitMqController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Producer producer;

    @ApiOperation("rabbitmq发送消息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deliverytag", value = "消息标识", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "message", value = "消息内容", required = true, paramType = "query", dataType = "String"),
    })
    @GetMapping("/send")
    public void send(@RequestParam String deliverytag, @RequestParam String message){
        logger.info("-----收到的入参:deliverytag:"+deliverytag+"---------message:"+message);
        producer.send(deliverytag, message);
    }
}
