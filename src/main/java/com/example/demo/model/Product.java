package com.example.demo.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Document(value= "product")
public class Product {
	@Id
	private String id;
	private String guideNumber;
	private String typeProduc;
	private String productQuantity;
	private String registrationDate;
	private String deadLine;
	private String deliveryWarehouse;
	private Double shippingPrice;
	private Double discount;
	private String idVehicle;
	private String idClient;
	private String typeTranpor;
	
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGuideNumber() {
		return guideNumber;
	}
	public void setGuideNumber(String guideNumber) {
		this.guideNumber = guideNumber;
	}
	public String getTypeProduc() {
		return typeProduc;
	}
	public void setTypeProduc(String typeProduc) {
		this.typeProduc = typeProduc;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	public String getDeliveryWarehouse() {
		return deliveryWarehouse;
	}
	public void setDeliveryWarehouse(String deliveryWarehouse) {
		this.deliveryWarehouse = deliveryWarehouse;
	}
	public Double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(Double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public String getIdVehicle() {
		return idVehicle;
	}
	public void setIdVehicle(String idVehicle) {
		this.idVehicle = idVehicle;
	}
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public String getTypeTranpor() {
		return typeTranpor;
	}
	public void setTypeTranpor(String typeTranpor) {
		this.typeTranpor = typeTranpor;
	}
	
	

	
}