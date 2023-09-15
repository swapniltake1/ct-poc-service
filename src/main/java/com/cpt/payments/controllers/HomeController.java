package com.cpt.payments.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.model.Payment;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to ct-Project API Homepage";
	}
	
	@PostMapping("/doPayment")
	public ResponseEntity<Payment> initPayment(@RequestBody Payment payment) {
		
		payment.setName(payment.getName());
		payment.setPhone(payment.getPhone());
		payment.setAmount(payment.getAmount());
		payment.setTransactionType(payment.getTransactionType());
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(payment);
	}
	
}
