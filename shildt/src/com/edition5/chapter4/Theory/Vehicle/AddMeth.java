package com.edition5.chapter4.Theory.Vehicle;

import com.edition5.chapter4.Theory.Vehicle.Vehicle;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(5,11,3);
        Vehicle sportsCar = new Vehicle(12,6,3);
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;

        range1 = minivan.range();
        range2 = sportsCar.range();

        System.out.print("Minivan can carry " + minivan.passengers + " with " +
                "range of " + range1 + " miles");
        System.out.print("SportsCar can carry " + sportsCar.passengers + " with " +
                "range of " + range2 + " miles");

    }
}
