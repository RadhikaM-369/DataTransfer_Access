package com.xworkz.bulb.dto;

public class BulbDto {
private int serialnumber;
private String brand;
private int price;
private int volt;
private String color;
public BulbDto(int serialnumber, String brand, int price, int volt, String color) {
	System.out.println("Inside Bulb");
	this.serialnumber = serialnumber;
	this.brand = brand;
	this.price = price;
	this.volt = volt;
	this.color = color;
}
public int getSerialnumber() {
	return serialnumber;
}
public void setSerialnumber(int serialnumber) {
	this.serialnumber = serialnumber;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getVolt() {
	return volt;
}
public void setVolt(int volt) {
	this.volt = volt;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

}
