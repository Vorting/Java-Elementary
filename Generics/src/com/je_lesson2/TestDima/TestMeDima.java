package com.je_lesson2.TestDima;

public class TestMeDima {

    public static void main(String[] args) {
        TestDima<String, String, Integer> fullName =
                new TestDima<String, String, Integer>("Dima", "Ivanov", 26);
        System.out.println(fullName.getName() + "\t" + fullName.getSurname() + "\t" + fullName.getYears());
    }
}
