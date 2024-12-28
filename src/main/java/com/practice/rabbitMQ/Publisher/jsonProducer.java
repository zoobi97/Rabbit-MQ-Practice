package com.practice.rabbitMQ.Publisher;

import com.practice.rabbitMQ.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class jsonProducer {
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.jsonBinding.name}")
    private String jsonKey;

    private static final Logger LOGGER = LoggerFactory.getLogger(jsonProducer.class);

    private RabbitTemplate rabbitTemplate;

    public jsonProducer(RabbitTemplate template) {
        this.rabbitTemplate = template;
    }

    public void SendMessage(User user){
        LOGGER.info(String.format("Json Message sent Service -> %s",user.getFirstName()));
        rabbitTemplate.convertAndSend(exchange,jsonKey,user);
    }

}
