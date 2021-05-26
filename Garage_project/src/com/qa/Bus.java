package com.qa;

public class Bus extends Vehicle {
	
	private int load;
	
	public Bus(int id, String color, String model, int year) {
		super(id, color, model, year);
		// TODO Auto-generated constructor stub
	}
	
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}

	@Override
	public String toString() {
		return "Bus [load=" + load + "]";
	}
	
	   
	  }
	

