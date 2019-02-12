package com.edition5.chapter5.theory.clDemo;

public class Phone {

    public static void main(String[] args) {

        String numbers[][] = {
                {"Dima", "555-3322"},
                {"Anzhelika", "555-8976"},
                {"Nastya", "555-1037"},
                {"Andrey", "555-1400"}
        };
        int i;

        // Чтобы воспользоваться программой, ей нужно передать
        // один аргумент коммандной строки.
        if (args.length != 1) {
            System.out.println(" Usage: java Phone <name>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Name not found!!!");
            }
        }
    }
}
