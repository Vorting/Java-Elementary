package com.edition5.chapter3.practice;

public class Spaces2 {
    public static void main(String args[]) throws java.io.IOException {

        char ch;
        int spaces = 0;
        System.out.println("Enter a period to stop.");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') {
                spaces++;
            }
        } while (ch != '.');
        System.out.println("Spaces: " + spaces);
    }
}