package com.practice.rabbitMQ.Publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.binding.name}")
    private String bindingKey;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);

    private RabbitTemplate rabbitTemplate;

    public RabbitMQProducer(RabbitTemplate template) {
        this.rabbitTemplate = template;
    }

    public void SendMessage(String message){
        LOGGER.info(String.format("Message sent -> %s",message));

        rabbitTemplate.convertAndSend(exchange,bindingKey,message);
    }
}
