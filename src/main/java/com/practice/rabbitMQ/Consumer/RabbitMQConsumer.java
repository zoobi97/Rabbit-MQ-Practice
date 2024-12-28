package com.practice.rabbitMQ.Consumer;

import com.practice.rabbitMQ.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consumer(String message){
        LOGGER.info(String.format("Message received by consumer %s",message));
    }

    @RabbitListener(queues = {"${rabbitmq.jsonQueue.name}"})
    public void jsonConsumer(User user){
        LOGGER.info(String.format("Object received by jsonConsumer %s",user));
    }
}
