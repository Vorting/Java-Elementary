package com.edition5.chapter6.theory.factorial;

public class FacotrialDemo {
    public static void main(String[] args) {

        Factorial fac = new Factorial();


        System.out.println("Fact using recursive call " + fac.factR(3));
        System.out.println("Fact using recursive call " + fac.factR(4));
        System.out.println("Fact using recursive call " + fac.factR(5));
        System.out.println();

        System.out.println("Fact using iterative method " + fac.FactI(3));
        System.out.println("Fact using iterative method " + fac.FactI(4));
        System.out.println("Fact using iterative method " + fac.FactI(5));
    }

    public static class Factorial {

        int factR(int n) {
            int result;

            if (n == 1) {
                return 1;

            }
            result = factR(n - 1) * n;
            return result;
        }

        int FactI(int n) {
            int result;

            result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
