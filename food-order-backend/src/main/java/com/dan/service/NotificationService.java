package com.dan.service;

import java.util.List;

import com.dan.model.Notification;
import com.dan.model.Order;
import com.dan.model.Restaurant;
import com.dan.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
