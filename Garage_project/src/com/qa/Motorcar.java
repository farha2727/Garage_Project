package com.qa;

public class Motorcar  extends Vehicle {
	protected String type;
	
	public Motorcar(int id, String color, String model, int year, String type) {
		super(id, color, model, year);
		this.type = type;
		
	}
	;
	
	
//	public Motercycle(int id, String color, String model, int year, String type) {
//	super(id, color, model, year);
//
//}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
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
    "Type: " +
    this.type +
    "\n" +
    "color: " +
    this.color +
    "\n"
  );
}
}





