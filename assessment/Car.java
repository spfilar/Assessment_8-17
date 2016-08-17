package com.assessment;

import java.util.Scanner;

public class Car extends Vehicle {

	public static String makeACar = null;
	public static String carMake = null;
	public static String carModel = null;
	public static String carColor = null;
	public static boolean turnOnEngine = false;
	public boolean isEngineOn = false;
	public static int numOfDoors = 0;
	public static int numOfWheels = 0;
	
	static Scanner ca = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Welcome to the Vehicle Builder");
		
		declareACar();
		
		chooseCarType();
		
		startEngine();	
		
	}

	public Car(boolean startEngine, String vehicleType, String makeACar, String carMake, String carModel, String carColor,
			boolean turnOnEngine, int numOfDoors, int numOfWheels) {
		super(startEngine, vehicleType);
		Car.makeACar = makeACar;
		Car.carMake = carMake;
		Car.carModel = carModel;
		Car.carColor = carColor;
		Car.turnOnEngine = turnOnEngine;
		Car.numOfDoors = numOfDoors;
		Car.numOfWheels = numOfWheels;
	}
	
	public Car() {
	}

	public static void declareACar() {
		Vehicle thisIsACar = new Vehicle();
		thisIsACar.chooseAVehicle();
		makeACar = thisIsACar.getVehicleType();
	}
	
	public static void startEngine() {
		Vehicle turnOnCar = new Vehicle();
		turnOnCar.engineOn();
		turnOnEngine = turnOnCar.isStartEngine();
	}
	
	public static void chooseCarType() {
		System.out.println("\nPlease enter the car make:");
		carMake = ca.nextLine();
		
		System.out.println("Please enter the car model:");
		carModel = ca.nextLine();
		
		System.out.println("Please enter the car color:");
		carColor = ca.nextLine();
		
		System.out.println("Please enter the number of doors:");
		numOfDoors = ca.nextInt();
		
		System.out.println("Please enter the number of wheels:");
		numOfWheels = ca.nextInt();
		
		System.out.println("You have chosen a " + makeACar + " that's a " + carColor
				+ " " + carMake + " " + carModel + " with " + numOfDoors + " doors and "
				+ numOfWheels + " wheels.");
	}
	

}
