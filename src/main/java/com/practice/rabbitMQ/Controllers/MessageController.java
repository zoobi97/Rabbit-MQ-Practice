package com.practice.rabbitMQ.Controllers;

import com.practice.rabbitMQ.DTO.User;
import com.practice.rabbitMQ.Publisher.RabbitMQProducer;
import com.practice.rabbitMQ.Publisher.jsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class MessageController {

    private RabbitMQProducer mqProducer;
    private jsonProducer jsonProducer;

    @Autowired
    public MessageController(RabbitMQProducer mqProducer,jsonProducer producer) {
        this.mqProducer = mqProducer;
        this.jsonProducer = producer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message){
        mqProducer.SendMessage(message);
        return ResponseEntity.ok("Message sent to Rabbit MQ");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        jsonProducer.SendMessage(user);
        return ResponseEntity.ok("Json Message sent to Rabbit MQ");
    }
}
