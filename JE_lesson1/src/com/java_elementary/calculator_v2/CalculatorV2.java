package com.java_elementary.calculator_v2;

import java.util.Scanner;

public class CalculatorV2 {

    private static char symbol = 0;
    private static int num1 = 0;
    private static int num2 = 0;
    private static int calcAnswer;
    private static int operationAnswer;

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

        operationAnswer = operationWithFunctions();
    }

    private static int operationWithFunctions() {
        switch (symbol) {
            case '/':
                calcAnswer = divisionNums(calcAnswer);
                System.out.println(calcAnswer);
                break;

            case '*':
                calcAnswer = multipleNums(calcAnswer);
                System.out.println(calcAnswer);
                break;

            case '-':
                calcAnswer = subtractionNums(calcAnswer);
                System.out.println(calcAnswer);
                break;

            case '+':
                calcAnswer = additionNums(calcAnswer);
                System.out.println(calcAnswer);
                break;

            default:
                System.out.println("Неправильный ввод");
        }
        return symbol;
    }

    private static int multipleNums(int multiple) {
        multiple = num1 * num2;
        return multiple;
    }

    private static int divisionNums(int division) {
        division = num1 / num2;
        return division;
    }

    private static int additionNums(int addition) {
        addition = num1 + num2;
        return addition;
    }

    private static int subtractionNums(int subtraction) {
        subtraction = num1 - num2;
        return subtraction;
    }
}

