package com.goodrestaurant.map.dto;

import lombok.Data;

@Data
public class ReviewDTO {
	
	String id;
	String title;
	String address;
	Integer grade;
	String review;
	
	//추가 컬럼으로 수정 lon, lat정보
	// Double lon;
	// Double lat;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
//	public Double getLon() {
//		return lon;
//	}
//	public void setLon(Double lon) {
//		this.lon = lon;
//	}
//	public Double getLat() {
//		return lat;
//	}
//	public void setLat(Double lat) {
//		this.lat = lat;
//	}
	@Override
	public String toString() {
		return "ReviewDTO [id=" + id + ", title=" + title + ", address=" + address + ", grade=" + grade + ", review="
				+ review + "]";
	}
	
}
