package org.ass.flipkart.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "stock_info")
public class StockEntity implements Serializable 
{
	@Id
	@GenericGenerator(name= "auto_gen", strategy = "increment")
	@GeneratedValue(generator ="auto_gen")
	@Column(name= "alt_key")
	private int altKey;
	
	@Column(name= "product_id")
	private String productId;
	
	@Column(name= "quantity")
	private int quantity;

	@Column(name= "price")
	private double price;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
