package com.example.paymentservice.service;

import com.example.common.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumerService {

	@KafkaListener(topics = "${app.kafka.topic.order}", groupId = "payment-group", containerFactory = "orderKafkaListenerContainerFactory")
	public void consumeOrder(Order order) {

		//Order orderData = new ObjectMapper().convertValue(order, Order.class);
		System.out.println("✅ Received Order for Payment: " + order.getOrderId());
	}

}
