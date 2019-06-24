package com.edition5.chapter7.theory.constructorDShape;

class Shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("isosceles", 4.0, 4.0);
        Triangle t2 = new Triangle("right", 8.0, 12.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
class TwoDShape {

    private double width;

    private double height;

    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        this.width = w;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        this.height = h;
    }
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}
class Triangle extends TwoDShape {

    private String style;


    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle " + style);
    }

}
