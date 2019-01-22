package com.edition5.chapter4.Theory.Vehicle;

import com.edition5.chapter4.Theory.Vehicle.Vehicle;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportsCar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportsCar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportsCar needs " +
                gallons + " gallons of fuel.");

    }
}
