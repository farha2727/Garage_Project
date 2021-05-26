package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
	
	Car honda = new Car (1,"Blue", "Xse8", 2021, 2);
    Motorcar sport = new Motorcar (2, "whit", "H1992", 2021, "oldg");
    Bus schoolBus = new Bus (3, "Yellow", "XXX3", 34);
    List<Vehicle> downtown = new ArrayList<Vehicle>();
    Garage location = new Garage(downtown);
//=================adds vehicles=================================
    location.addVehcle(honda);
    location.addVehcle(sport);
 //================calculate bill================================
    double bill = location.calcBill();
    System.out.println("Your fee is: "+ bill + "$");
//===============Vehicles  in the garage==============================
    location.printList();
//=====================remove by object====================================
    location.removeByID(2);
    location.printList();
    location.removeByID(2);
    location.printList();
//Add by Type
    location.addVehcle(schoolBus);
    location.printList();
    location.removeAll();
    location.printList();
//Add and Remove=====================================
    location.addVehcle(schoolBus);
    location.printList();
    location.removeByType("Bus");
    location.printList();
}








	}


