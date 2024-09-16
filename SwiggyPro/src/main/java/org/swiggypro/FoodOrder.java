package org.swiggypro;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String foodItem;
	private double cost;
	
	private LocalDateTime delivaryTime;
	
	@CreationTimestamp
	private LocalDateTime orderedTime;
	
	@UpdateTimestamp
	private LocalDateTime orderUpdateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDateTime getDelivaryTime() {
		return delivaryTime;
	}

	public void setDelivaryTime(LocalDateTime delivaryTime) {
		this.delivaryTime = delivaryTime;
	}

	public LocalDateTime getOrderedTime() {
		return orderedTime;
	}

	public void setOrderedTime(LocalDateTime orderedTime) {
		this.orderedTime = orderedTime;
	}

	public LocalDateTime getOrderUpdateTime() {
		return orderUpdateTime;
	}

	public void setOrderUpdateTime(LocalDateTime orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", foodItem=" + foodItem + ", cost=" + cost + ", delivaryTime=" + delivaryTime
				+ ", orderedTime=" + orderedTime + ", orderUpdateTime=" + orderUpdateTime + "]";
	}
	
	
	
}
