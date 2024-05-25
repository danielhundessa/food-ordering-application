package com.dan.service;

import com.stripe.exception.StripeException;
import com.dan.model.Order;
import com.dan.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
