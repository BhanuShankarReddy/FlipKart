package org.ass.flipkart.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "order_info")//
public class OrderEntity implements Serializable
{
	@Id
	@GenericGenerator(name= "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name= "alt_key")
	private int altKey;
	
	@Column(name= "product_id")
	private String productId;
	
	@Column(name= "quantity")
	private int quantity;
	
	@Column(name= "total_price")
	private double totalPrice;
	
	@Column(name= "sold_date")
	private Date soldDate;
	
	@Column(name= "payment_mode")
	private String paymentMode;

	public int getAltKey() {
		return altKey;
	}

	public void setAltKey(int altKey) {
		this.altKey = altKey;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	
}
