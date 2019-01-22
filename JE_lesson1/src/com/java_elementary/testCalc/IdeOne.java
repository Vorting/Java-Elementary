package com.java_elementary.testCalc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;


public class IdeOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        List<String> expression = Calculator.parse(nums);

        System.out.println("Введите данные... :");
        System.out.println(nums + " = " + calc(expression));

    }

    private static Double calc(List<String> postfix) {
        Deque<Double> stack = new ArrayDeque<Double>();
        for (String x : postfix) {
            if (x.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (x.equals("-")) {
                Double b = stack.pop();
                Double a = stack.pop();
                stack.push(a - b);
            } else if (x.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (x.equals("/")) {
                Double b = stack.pop();
                Double a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Double.valueOf(x));
            }
        }
        return stack.pop();
    }
}

