package com.example.orderevents.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.common.Order;


//This class is a Kafka producer that sends Order messages to a Kafka topic
@Service
public class OrderProducer {

	//Send messages
    private final KafkaTemplate<String, Order> kafkaTemplate;

    //Topic name
    @Value("${app.kafka.topic.order}")
    private String orderTopic;

    public OrderProducer(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrder(Order order) {
        kafkaTemplate.send(orderTopic, order.getOrderId(), order);
        System.out.println("Produced Order: " + order);
    }
}
