package com.edition5.chapter3.practice;

import java.util.Scanner;

/*Задача. Напишите программу, которая вводила бы символы с клавиатуры до тех пор, пока
не встретится точка. Предусмотрите в программе счетчик числа пробелов. Сведения
о количестве пробелов должны выводиться в конце программы.
 */
public class Spaces {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = "";
        int counter = 0;
        System.out.println("Type something (press \'.\' for quit): ");
        do {
            str = in.nextLine();
            for (int k = 0; k < str.length(); k++) {
                char a = str.charAt(k);
                if (a == ' ') {
                    counter++;
                }
            }
        } while (!str.equals("."));
        System.out.println("Number of whiteSpaces: " + counter);
    }
}
