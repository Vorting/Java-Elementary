package com.edition5.chapter5.theory.string.stringArrays;

public class StringArrays {

    public static void main(String[] args) {


        String[] strings = {"This", "is", "a", "test."};
        System.out.println("Original array: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        strings[1] = "was";
        strings[3] = "test, too!";

        System.out.println(" Modified array: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
