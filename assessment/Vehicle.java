package com.assessment;

import java.util.Scanner;

public class Vehicle {
	
	public boolean startEngine = false;
	public String vehicleType = null;
	
	Scanner ve = new Scanner(System.in);
	
	public Vehicle(boolean startEngine, String vehicleType) {
		this.startEngine = startEngine;
		this.vehicleType = vehicleType;
	}
	
	public Vehicle() {
	}
	
	public void engineOn() {
		
		System.out.println("\nWould you like to turn the engine on?");
		String userInput = ve.nextLine();
		
		if (userInput == "yes") {
			startEngine = true;
			System.out.println("The engine is now on");
		} else {
			startEngine = false;
			System.out.println("The engine is off");
		}
		
	}
	
	public void chooseAVehicle () {
		System.out.println("Please enter a vehicle type:");
		vehicleType = ve.nextLine();
	}

	public boolean isStartEngine() {
		return startEngine;
	}

	public void setStartEngine(boolean startEngine) {
		this.startEngine = startEngine;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
