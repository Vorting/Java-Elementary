package com.edition5.chapter6.practice.stackExerices;

class Stack {
    private char[] stack;// массив для хранения элементов очереди
    private int tos; // вершина стека

    // строим пустой стек
    Stack(int size) {
        stack = new char[size]; // выделяем память
        tos = 0;
    }

    // создаем стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stack = new char[ob.stack.length];

        for (int i = 0; i < tos; i++) {
            stack[i] = ob.stack[i];
        }
    }

    void push(char ch) {
        if (tos == stack.length) {
            System.out.println(" - Stack is full.");
            return;
        }
        stack[tos] = ch;
        tos++;
    }

    Stack(char a[]) {
        stack = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    char pop() {
        if (tos == 0) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }
        tos--;
        return stack[tos];
    }
}
