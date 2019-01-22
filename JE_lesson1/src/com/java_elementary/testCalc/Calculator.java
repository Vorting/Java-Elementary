package com.java_elementary.testCalc;

import java.util.*;

public class Calculator {

    private static String operators = "+-*/";

    private static boolean isOperator(String token) {
        for (int i = 0; i < operators.length(); i++) {
            if (token.charAt(0) == operators.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private static int priority(String token) {
        if (token.equals("+") || token.equals("-")) {
            return 1;
        }
        if (token.equals("*") || token.equals("/")) {
            return 2;
        }
        return 0;
    }


    static List<String> parse(String infix) { //создаем очередь и перебираем операторы
        List<String> postfix = new ArrayList<String>(); //массив со всеми знаками, аля польская нотация
        Deque<String> stack = new ArrayDeque<String>(); //для хранения перемменых
        StringTokenizer tokenizer = new StringTokenizer(infix, operators, true);
        String curr = ""; // временное хранение "нарезанного" элемента.
        while (tokenizer.hasMoreTokens()) { //перебираем до тех пор, пока у нас есть знаки/числа
            curr = tokenizer.nextToken();  //записываем текущий знак/число
            if (isOperator(curr)) { //если записанный знак соответствует перебираемому
                while (!stack.isEmpty() && (priority(curr) <= priority(stack.peek()))) {// выполняем
                    // пока стэк не закончился
                    // и приоритет текущего числа/знака меньше, либо равен хранимому элементу в стэке
                    postfix.add(stack.pop());
                }
                stack.push(curr);
            } else {
                postfix.add(curr);
            }
        }

        while (!stack.isEmpty()) {
            if (isOperator(stack.peek())) {
                postfix.add(stack.pop());
            }
        }
        return postfix;
    }
}