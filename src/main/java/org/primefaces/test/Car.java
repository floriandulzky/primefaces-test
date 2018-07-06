package org.primefaces.test;

public class Car {

	private String id, brand, color;
	private int year, price;
	private boolean soldState;
	
	public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice,
			boolean randomSoldState) {
		this.id = randomId;
		this.brand = randomBrand;
		this.year = randomYear;
		this.color = randomColor;
		this.price = randomPrice;
		this.soldState = randomSoldState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldState() {
		return soldState;
	}

	public void setSoldState(boolean soldState) {
		this.soldState = soldState;
	}

	

}
