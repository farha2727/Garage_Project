package com.qa;

public abstract class Vehicle {

	protected int id;
	   protected String color;
	    protected String model;
	    protected int year;
	   
public Vehicle(int id, String color, String model, int year) {
		 	this.id = id;
			this.color = color;
			this.model = model;
			this.year = year;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
	 	
	}

