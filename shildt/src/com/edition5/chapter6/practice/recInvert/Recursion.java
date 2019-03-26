package com.edition5.chapter6.practice.recInvert;

class RecursionRec {
    public static void main(String[] args) {
        Recursion recursion = new Recursion("Hello");

        recursion.Rec(0);
    }


    private static class Recursion {
        String string;

        Recursion(String s) {
            string = s;
        }

        void Rec(int index) {
            if (index != string.length() - 1) Rec(index + 1);
            {
                System.out.println(string.charAt(index));
            }
        }

    }
}
