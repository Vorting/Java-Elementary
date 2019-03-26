package com.edition5.chapter6.theory.overload;

public class Overload {

    // первый вариант метода.
    void ovlDemo() {
        System.out.println("No parameters");
    }

    // перегузим метод ovlDemo с одинм параметром типа int
    // второй вариант
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    // перегрузим метод ovlDemo с двумя параметрами типа int
    // третий вариант
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + b + ", " + b);
        return a + b;
    }

    // перегрузим метод ovlDemo с двумя параметрами типа double
    // четвертый вариант метода
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + ", " + b);
        return a + b;
    }
}
