package com.lkker.msrabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liliang
 * @Date 2019/5/12 11:51
 * @Description
 **/

@Configuration
public class RabbitmqConfig {

    @Value("${spring.rabbitmq.addresses}")
    private String address;

    @Value("${spring.rabbitmq.port}")
    private int port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtualhost}")
    private String virtualhost;

    @Bean(value = "connectionFactory")
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(address);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualhost);
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }


    // 创建交换机
    @Bean(value = "topicExchange")
    public TopicExchange topicExchange(){
        return new TopicExchange("lkker-topicExchange");
    }

    // 创建队列
    @Bean(value = "queue")
    public Queue queue(){
        return new Queue("lkker-queue001");
    }

    // 创建交换机和队列的绑定
    @Bean
    public Binding binding(@Qualifier("topicExchange") TopicExchange topicExchange, @Qualifier("queue") Queue queue){
        return BindingBuilder.bind(queue).to(topicExchange).with("lkker.test001");
    }

}
