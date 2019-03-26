package com.edition5.chapter3.practice;

import java.io.IOException;

public class Help {
    public static void main(String args[]) throws IOException {

        System.out.println("Help on: ");
        System.out.println("\t1.\'if\'" + ";");
        System.out.println("\t2.\'switch\'" + ".");
        System.out.println("Choose one: ");

        char choice;
        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if:");
                System.out.println("if(condition){\n statement;\n}");
                System.out.println("else statement {" + " \n}");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("case constant 1:");
                System.out.println("statement sequence;");
                System.out.println("break;");
                System.out.println("case constant n:");
                System.out.println("break;\n}");
                break;
            default:
                System.out.println("Selection not found.");
        }
    }
}

