package com.edition5.chapter7.practice;

public class Vehicle {
    private int passengers; //кол-во пассажиров
    private int fuelCap; // емкость топливного бака
    private int mpg; //потребление топлива в милях на галлон

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

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelCap() {
        return fuelCap;
    }

    void setFuelCap(int f) {
        fuelCap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}
