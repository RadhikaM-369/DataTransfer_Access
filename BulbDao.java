package com.xworkz.bulb.dao;

import com.xworkz.bulb.dto.BulbDto;

public class BulbDao {

	public BulbDao() {
		System.out.println("Inside DAO constructor");
	}
	
	public BulbDto createBulbDto(int serialnumber, String brand, int price, int volt, String color) {
		System.out.println("Inside create method");
		BulbDto bulbDto=new BulbDto(serialnumber,brand,price,volt,color);
		return bulbDto;
	}

	public void displayBulbDto(BulbDto dto) {
		System.out.println("Inside the display method");
		System.out.println(dto.getSerialnumber());
		System.out.println(dto.getBrand());
		System.out.println(dto.getVolt());
	}
}
