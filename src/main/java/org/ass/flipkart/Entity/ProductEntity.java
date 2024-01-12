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
@Table(name= "product_info")
public class ProductEntity implements Serializable 
{
	@Id
	@GenericGenerator(name= "auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name= "alt_key")
	private int altKey;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "product_type")
	private String productType;
	
	@Column(name= "price")
	private double price;
	
	@Column(name= "description")
	private String description;
	
	@Column(name= "manufacture_date")
	private Date manufactureDate;

	public int getAltKey() {
		return altKey;
	}

	public void setAltKey(int altKey) {
		this.altKey = altKey;
	}

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


	

}
