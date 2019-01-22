package com.java_elementary;
/* Задача: Создать калькулятор
 */

import java.util.Scanner;

public class Calculator {

    private static char symbol = 0;
    private static int num1 = 0;
    private static int num2 = 0;
    private static int calcAnswer;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        num2 = sc.nextInt();

        System.out.println("Введите операцию: " + "\'/\'- деление " + ", " + "\'*\' - умножение,");
        System.out.print("\'+\'- сложение " + ", " + "\'-\' - вычитание");
        System.out.println(" ");
        symbol = sc.next().charAt(0);




        switch (symbol) {
            case '/':
                calcAnswer = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + calcAnswer);
                break;

            case '*':
                calcAnswer = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + calcAnswer);
                break;

            case '-':
                calcAnswer = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + calcAnswer);
                break;

            case '+':
                calcAnswer = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + calcAnswer);
                break;


            default:
                System.out.println("Неправильный ввод");

        }
    }
}
