package com.qa;

public class Car extends Vehicle {

	private int doors;
	   
    
	   
	 Car(int id, String color, String model, int year, int doors) {
			super(id, color, model, year);
			this.doors = doors;
		}
	public int getDoors() {
		return doors;
	}
	 public void setDoors(int doors) {
		this.doors = doors;
	}
		
		 @Override
		  public String toString() {
		    return (
		      "Model: " +
		      this.model +
		      "\n" +
		      "Year: " +
		      this.year +
		      "\n" +
		      "Color: " +
		      this.color +
		      "\n" +
		      "Door Number: " +
		      this.doors +
		      "\n"
		    );
		  }
		}

