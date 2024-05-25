package com.dan.service;

import java.util.List;

import com.dan.Exception.ReviewException;
import com.dan.model.Review;
import com.dan.model.User;
import com.dan.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
