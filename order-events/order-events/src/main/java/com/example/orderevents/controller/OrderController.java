package com.example.orderevents.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.common.Order;

import com.example.orderevents.service.OrderProducer;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderProducer orderProducer;

	public OrderController(OrderProducer orderProducer) {
		this.orderProducer = orderProducer;
	}

	@PostMapping
	public ResponseEntity<String> placeOrder(@RequestBody Order order) {
		order.setStatus("CREATED");
		orderProducer.sendOrder(order);
		return ResponseEntity.ok("Order placed successfully with ID: " + order.getOrderId());
	}
}
