package com.goodrestaurant.map.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.goodrestaurant.map.dto.ReviewDTO;

public interface ReviewDAO {
	
	void saveReview(ReviewDTO reviewDTO);
	List<ReviewDTO> getReviews();
	void deleteReview(@RequestParam("id") String id);

}
