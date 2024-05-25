package com.dan.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.dan.Exception.CartException;
import com.dan.Exception.OrderException;
import com.dan.Exception.RestaurantException;
import com.dan.Exception.UserException;
import com.dan.model.Order;
import com.dan.model.PaymentResponse;
import com.dan.model.User;
import com.dan.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
