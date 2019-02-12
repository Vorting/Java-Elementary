package com.edition5.chapter5.theory.lowCase;

// Преобразование прописных букв английского алфавита в строчные,
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            // В следующем операторе устанавливается шестой бит,
            // в итоге переменная ch содержит код символа строчной буквы
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
