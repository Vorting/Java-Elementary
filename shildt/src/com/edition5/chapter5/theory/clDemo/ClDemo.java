package com.edition5.chapter5.theory.clDemo;

// отображение всех данных, указываемых в командной строке.
public class ClDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length +
                " command-line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
