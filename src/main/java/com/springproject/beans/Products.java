package com.springproject.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_products")
public class Products {
	
	@Column(name = "prodId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "prodName")
	private String productName;

	@Column(name = "prodValue")
	private Double productValue;
	
	@Column(name = "prodQtd")
	private int productQuantity;
	
	@Column(name = "prodBrand")
	private String productBrand;
	
	public Products() {
		super();
		
	}
	
	public Products(int id, String productName, Double productValue, int productQuantity, String productBrand) {
		super();
		this.id = id;
		this.productName = productName;
		this.productValue = productValue;
		this.productQuantity = productQuantity;
		this.productBrand = productBrand;
	}

	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductValue() {
		return productValue;
	}

	public void setProductValue(Double productValue) {
		this.productValue = productValue;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	

}
