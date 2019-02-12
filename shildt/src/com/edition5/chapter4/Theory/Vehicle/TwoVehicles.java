package com.edition5.chapter4.Theory.Vehicle;

import com.edition5.chapter4.Theory.Vehicle.Vehicle;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(1, 3, 5);
        Vehicle sportsCar = new Vehicle(2,2,33);

        int range1, range2;
        //присваиваем значения полям в обьекте minivan
        minivan.mpg = 21;
        minivan.fuelCap = 16;
        minivan.passengers = 7;
        //присваиваем значения поляв в обьекте sportsCar
        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;
        //расчитываем дальность действия ТС,
        //исходя из того что топливный бак полный
        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportsCar.fuelCap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " passengers " +
                " with a range of " + range1);
        System.out.println("SportsCar can carry " + sportsCar.passengers + " passengers " +
                " with a range of " + range2);
    }
}
