package org.ass.flipkart.dto;

import java.io.Serializable;
import java.sql.Date;

public class ProductDto implements Serializable
{
	private String name;
	
	private String productType;
	
	private double price;
	
	private String description;
	
	private Date manufactureDate;
	
	private int quantity;

	private String productId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
		}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	

}
