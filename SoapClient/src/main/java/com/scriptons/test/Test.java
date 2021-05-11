package com.scriptons.test;
import com.scriptons.crop.CropClassService;
import com.scriptons.crop.CropClass;
public class Test {

	public static void main(String[] args) {
		CropClassService cr=new CropClassService();
		CropClass c=cr.getCropClass();
		c.setName("yajit");
		System.out.println("Moisture "+c.getMoisture());

	}

}
