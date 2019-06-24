package com.edition5.chapter7.practice;

public class TruckDemo {
    public static void main(String[] args) {

        Truck semi = new Truck(2, 200, 7, 4400);
        Truck pickup = new Truck(2, 14, 12, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Semi can carry " + semi.getCargo() + " pounds. ");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");

        gallons = semi.fuelNeeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");

    }
}
