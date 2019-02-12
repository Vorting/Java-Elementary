package com.edition5.chapter4.Theory.Vehicle;

public class Vehicle {

    public int passengers; //кол-во пассажиров
    public int fuelCap; // емкость топливного бака
    public int mpg; //потребление топлива в милях на галлон

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;

    }

    // возвратить дальность действия транспортного средства
    public int range() {
        return fuelCap * mpg;
    }

    // рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
