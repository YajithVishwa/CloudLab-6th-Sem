package com.yajith.crop;

public class CropClass implements Crop {
	private String name=null;
	public int age;
	private float moisture;
	@Override
	public void setName(String names) {
		this.name=names;

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int ages) {
		this.age = ages;

	}

	@Override
	public void setMoisture(float moistures) {
		this.moisture = moistures;

	}

	@Override
	public float getMoisture() {
		return this.moisture;
	}

}
