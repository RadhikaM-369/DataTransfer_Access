package com.xworkz.bulb;
import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.dao.BulbDao;

public class Tester {

	public static void main(String[] args) {

		BulbDao bdao=new BulbDao();
		
		BulbDto createBulbDto=bdao.createBulbDto(123, "bajaj", 150, 30, "white");
		
		bdao.displayBulbDto(createBulbDto);

	}

}
