package com.goodrestaurant.map.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goodrestaurant.map.dao.ReviewDAO;
import com.goodrestaurant.map.dto.ReviewDTO;

@RestController
@RequestMapping("/api/review")
public class ReviewCtrl {
    @Autowired
    private ReviewDAO reviewDAO;

    @PostMapping("/saveReview")
    public void saveReview(@RequestBody ReviewDTO reviewDTO) {
        String id = reviewDTO.getId();
        if (id == null) {
        	String uuidStr = UUID.randomUUID().toString();
        	reviewDTO.setId(uuidStr);
        }
        reviewDAO.saveReview(reviewDTO);
    }
    
    @GetMapping("/getReviews")
    public List<ReviewDTO> getReviews() { 
    	return reviewDAO.getReviews(); 
    }
    
    @DeleteMapping("/deleteReview")
    public void deleteReview(@RequestParam(value = "id", required = true) String id) {
        reviewDAO.deleteReview(id);
    }
}
